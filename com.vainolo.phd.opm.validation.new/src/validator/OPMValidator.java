package validator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.util.DelegatingEcoreEList.Generic;

import GenericItems.GenericThing;

public class OPMValidator {
	
	private OPMValidator instance;
	RulesContainer rulesMat;
	
	public OPMValidator getInstance() {
		if (instance == null) {
			instance = new OPMValidator();
		}
		return instance;
	}
	private OPMValidator(){
		this.rulesMat = new RulesContainer();
	};
	
	public boolean addRule(GenericThing a, GenericThing b, GenericThing c){   //Return 0 if done, 1 otherwise
		GenericThing[][] RulesMatrix;  //will hold a set of rules in each cell
		if ((RulesMatrix[a][c]!=null ) && (RulesMatrix[a,c].specified == true) return false; 
		List<Class<?>> d = GenericThing.class.GetSonsOfType(b);
		RulesMatrix[a][c].add(b);     //
		int len = d.size();
		for (int i=0; i<len; i++)
		{
			addrule(GenericThing , Generic Thing, GenericThing)
		}
		
		
		
		return true;
	};
	
	
	public List<GenericThing> getSonsRecursive(GenericThing link) {
		// TODO - add a validation that this is indeed a link?
		List<GenericThing> returnList = new ArrayList<GenericThing>();
		List<GenericThing> sons = link.GetSonsOfType();
		for (GenericThing son : sons) {
			if (! returnList.contains(son)) {
				returnList.addAll(getSonsRecursive(son));
			}
		}		
		return returnList;
	}
}


/* TODO  
 * define types: 	source/dest (both of type node)
 * 					link
 * 
 * define a data structure to hold the rules
 * in generic thing - Eyal suggested using <T> - why?
 * Ask Arieh for Arranged Information about OPM Rules (REAL)
 * OPM Rules - Data Structures
 *   */
 