package demo.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {

	private Map<Character, FlyWeight> files = new HashMap<Character, FlyWeight>();

	public FlyWeight factory(Character state) {

		FlyWeight fly = files.get("state");
		if (fly == null) {
			fly = new ConcreteFlyWeight(state);
			files.put(state, fly);
		}
		return fly;
	}
}
