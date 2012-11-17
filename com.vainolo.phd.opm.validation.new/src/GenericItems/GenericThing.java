package GenericItems;

import java.util.List;

public interface GenericThing {
	public Class<?> GetType();
	public List<Class<?>> GetParentsOfType();
	public List<Class<?>> GetSonsOfType(GenericThing a);
}
