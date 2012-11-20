package GenericItems;

import java.util.List;

public interface GenericThing {
	public Class<?> GetType();
	public List<GenericThing> GetParentsOfType();
	public List<GenericThing> GetSonsOfType();
	
}
