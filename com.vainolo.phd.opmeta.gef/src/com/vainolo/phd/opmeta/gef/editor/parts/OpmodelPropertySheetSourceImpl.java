package com.vainolo.phd.opmeta.gef.editor.parts;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.properties.ComboBoxPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import com.vainolo.phd.opm.model.OPMNamedElement;
import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.model.VerticalAlignment;
import com.vainolo.phd.opmodel.model.InstanceBase;
import com.vainolo.phd.opmodel.model.PropertyInstance;
import com.vainolo.phd.opmodel.model.opmodelPackage;

public class OpmodelPropertySheetSourceImpl implements IPropertySource{

	private final InstanceBase instance;
	private IPropertyDescriptor [] descriptors;
	private static final String namePropId = "__Name_Id";
	private static final String alignmentPropId = "__Alignment_Id";
	private static final String[] alignmentValues = 
		{VerticalAlignment.BOTTOM.getLiteral(),VerticalAlignment.CENTER.getLiteral(),VerticalAlignment.TOP.getLiteral()};
	
	public OpmodelPropertySheetSourceImpl(InstanceBase instance){
		this.instance = instance;
	}
	
	public IPropertyDescriptor[] getPropertyDescriptors() {
		if (descriptors == null){
			int numOfDescriptors = instance.getProperties().size();
			if (instance instanceof OPMNamedElement) numOfDescriptors += 2;
			descriptors = new IPropertyDescriptor[numOfDescriptors];
			int i=0;
			if (instance instanceof OPMNamedElement){
				descriptors[0]=new TextPropertyDescriptor(namePropId, "Name");
				ComboBoxPropertyDescriptor comboprop =new ComboBoxPropertyDescriptor(alignmentPropId, "Alignment",alignmentValues);
				
				
				descriptors[1]=comboprop;
				i=2;
			}
			for (PropertyInstance property:instance.getProperties()){
				descriptors[i]=new TextPropertyDescriptor(property.getName(), property.getName() +" : " + property.getType());
				i++;
			}
		}
		return descriptors;			
	}

	public Object getPropertyValue(Object id) {
		if (id.equals(namePropId))
			return ((OPMNamedElement)instance).getName();
		if (id.equals(alignmentPropId))
			return alignmentToValeIndex(((OPMNamedElement)instance).getAlignment());
		return instance.getProperty((String)id).getValue();
	}

	public void setPropertyValue(Object id, Object value) {
		if (PlatformUI.getWorkbench().isClosing()) return;
		if (id.equals(namePropId)){
			((OPMNamedElement)instance).setName((String)value);
		} else if (id.equals(alignmentPropId)){
			((OPMNamedElement)instance).setAlignment(valeIndexToAlignment((int)value));
		} else {
			PropertyInstance prop = instance.getProperty((String)id);
			if (!prop.setValue((String)value)){
				
				MessageDialog.openWarning(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),"OPclipse",
	                     "Value '" + ((String)value) + "' is not legal for " + prop.getType().getName());
			} 
		}
	}

	public boolean isPropertySet(Object id) {
		if (id.equals(namePropId)){
			return instance.eIsSet(OPMPackage.eINSTANCE.getOPMNamedElement_Name());
		} else if (id.equals(alignmentPropId)){
			return instance.eIsSet(OPMPackage.eINSTANCE.getOPMNamedElement_Alignment());
		} else {
			PropertyInstance prop = instance.getProperty((String)id);
			return prop.eIsSet(opmodelPackage.eINSTANCE.getPropertyInstance_Value());
		}
	}
	
	public void resetPropertyValue(Object id) {
		if (id.equals(namePropId)){
			instance.eUnset(OPMPackage.eINSTANCE.getOPMNamedElement_Name());
		} else if (id.equals(alignmentPropId)){
			instance.eUnset(OPMPackage.eINSTANCE.getOPMNamedElement_Alignment());
		}
	}

	@Override
	public Object getEditableValue() {
		return null;
	}	

	private int alignmentToValeIndex(VerticalAlignment alignment){
		switch(alignment){
		case TOP:
			return 2;
		case CENTER:
			return 1;
		case BOTTOM:
			return 0;
		}
		return -1;
	}
	
	private VerticalAlignment valeIndexToAlignment(int value){
		switch(value){
		case 2:
			return VerticalAlignment.TOP;
		case 0:
			return VerticalAlignment.BOTTOM;
		}
		return VerticalAlignment.CENTER;
	}
}
