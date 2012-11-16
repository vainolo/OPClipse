package validator;

public class OPMValidator {
	
	private OPMValidator instance;
	
	public OPMValidator getInstance() {
		if (instance == null) {
			instance = new OPMValidator();
		}
		return instance;
	}
	private OPMValidator(){};
	
	public Boolean addRule(){
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
 