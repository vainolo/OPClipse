package com.vainolo.phd.opmeta.interpreter;

import java.util.HashMap;

import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelContainerInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelFactory;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelLinkInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelNodeInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelThingInstance;
import com.vainolo.phd.opmeta.model.ContainerInstanceBase;
import com.vainolo.phd.opmeta.model.LinkInstanceBase;
import com.vainolo.phd.opmeta.model.NodeInstanceBase;
import com.vainolo.phd.opmeta.model.ThingInstanceBase;

public class OpmodelInterpretationCreator {

	private OpmodelFactory factory;
	private OpmetaInterpretation opmeta;
	private HashMap<NodeInstanceBase,OpmodelNodeInstance> nodeMap;
	
	private OpmodelInterpretationCreator(OpmetaInterpretation opmeta){
		this.opmeta= opmeta;
		factory  = new OpmodelFactory(opmeta);
		nodeMap = new HashMap<NodeInstanceBase,OpmodelNodeInstance>();
	}
	
	public static OpmodelContainerInstance Create(OpmetaInterpretation opmeta,ContainerInstanceBase rootContainer){
		if (opmeta == null) throw new RuntimeException("opmeta cannot be null");
		OpmodelInterpretationCreator inter = new OpmodelInterpretationCreator(opmeta);
		return inter.Create(rootContainer);
	}
	
	private OpmodelContainerInstance Create(ContainerInstanceBase rootContainer)
	{
		OpmodelContainerInstance container = null;
		
		String typeName = rootContainer.getTypeName();
		if (!opmeta.isContainer(typeName)){
			System.out.println("Could not find container type: "+typeName);
			return null;
		}
		container = (OpmodelContainerInstance)factory.createOpmodelInstance(rootContainer);
		if (container != null)
			fillContainer((ContainerInstanceBase)rootContainer,container);
		
		return container;
	}
	
	private OpmodelNodeInstance Create(NodeInstanceBase baseNode)
	{
		OpmodelNodeInstance node = null;
		
		String typeName = baseNode.getTypeName();
		if (!opmeta.isNode(typeName)){
			System.out.println("Could not find node type: "+typeName);
			return null;
		}
		if (opmeta.isContainer(typeName) && (baseNode instanceof ThingInstanceBase)){
			OpmodelThingInstance thing =(OpmodelThingInstance)factory.createOpmodelInstance((ThingInstanceBase)baseNode);
			if (thing != null)
				fillContainer((ContainerInstanceBase)baseNode,thing);
			node = thing;
		} else {
			node =(OpmodelNodeInstance)factory.createOpmodelInstance(baseNode);
		}		
		
		return node;
	}

	private void fillContainer(ContainerInstanceBase baseContainer,	OpmodelContainerInstance container) {
		for (NodeInstanceBase nodeBase:baseContainer.getNodes()){
			OpmodelNodeInstance node =  Create(nodeBase);
			container.addNode(node);
			nodeMap.put(nodeBase, node);
		}
		
		for (LinkInstanceBase linkBase:baseContainer.getLinks()){
			OpmodelLinkInstance link = Create(linkBase);
			if (link!=null)
				container.addLink(link);
		}
	}

	private OpmodelLinkInstance Create(LinkInstanceBase linkBase) {
		OpmodelLinkInstance link = null;
		
		String typeName = linkBase.getTypeName();
		if (!opmeta.isLink(typeName)){
			System.out.println("Could not find link type: "+typeName);
			return null;
		}
		link =(OpmodelLinkInstance)factory.createOpmodelInstance(linkBase);
		if (link == null) return link;
		OpmodelNodeInstance source = nodeMap.get(linkBase.getSource());
		OpmodelNodeInstance target = nodeMap.get(linkBase.getTarget());
		if (source == null || null==target){
			System.out.println("Link " + linkBase.getId() + " Is missing source or target.");
			return null;
		}
		link.setSource(source);
		link.setTarget(target);
		return link;
	}
}
