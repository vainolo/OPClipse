package com.vainolo.phd.opmeta.gef.editor.parts;

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

	private InstanceBase instance;
	private IPropertyDescriptor [] descriptors;
	private static final String namePropId = "__Name_Id";
	private static final String alignmentPropId = "__Alignment_Id";
	private static final String[]  alignmentValues = {"Center"};
	
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
				descriptors[1]=new ComboBoxPropertyDescriptor(alignmentPropId, "Alignment",alignmentValues);
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
			return ((OPMNamedElement)instance).getAlignment();
		return instance.getProperty((String)id).getValue();
	}

	public void setPropertyValue(Object id, Object value) {
		if (id.equals(namePropId)){
			((OPMNamedElement)instance).setName((String)value);
		} else if (id.equals(alignmentPropId)){
			((OPMNamedElement)instance).setAlignment((VerticalAlignment)value);
		} else {
			PropertyInstance prop = instance.getProperty((String)id);
			if (!prop.setValue((String)value))
				throw new RuntimeException("Ilegal Value!"); //TODO: find how to show message
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

}
