package prac;

import java.util.HashMap;
import java.util.Map;

public class MapBasedMessageFactory {
	private Map<String, Class> mapfact;

	public MapBasedMessageFactory() {
		mapfact = new HashMap<String, Class>();
	}

	public boolean register(String keyIn, String classNameIn) {
		boolean success = false;
		Class value;
		try {
			value = Class.forName(classNameIn);
			mapfact.put(keyIn, value);
			success=true;

		} catch (ClassNotFoundException e) {
			success = false;
		}

		return success;
	}

	public Object newInstance(String keyIn) {
		Object newObject = null;
		Class value = mapfact.get(keyIn);
		try {
			newObject = value.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			throw new RuntimeException();
		}
		return newObject;

	}

}
