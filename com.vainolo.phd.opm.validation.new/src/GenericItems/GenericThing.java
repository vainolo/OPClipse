package GenericItems;

import java.util.List;

public interface GenericThing {
	public Object GetType();
	public List<GenericThing> GetParentsOfType();
	public List<GenericThing> GetSonsOfType();
	
}