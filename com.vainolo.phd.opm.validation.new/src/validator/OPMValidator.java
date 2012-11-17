package validator;

import java.util.List;

import GenericItems.GenericThing;

public class OPMValidator {
	
	private OPMValidator instance;
	
	public OPMValidator getInstance() {
		if (instance == null) {
			instance = new OPMValidator();
		}
		return instance;
	}
	private OPMValidator(){};
	
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
 