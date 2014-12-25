package simUDuck_design;

import org.junit.Test;

import simUDuck_design.ducks.MallardDuck;
import simUDuck_design.ducks.ModelDuck;
import simUDuck_design.impl.FlyRocketPowoered;

public class test {

	@Test
	public void testMallaredDuck() {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		//fail("Not yet implemented");
		
	}

	@Test
	public void testModelDuck(){
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowoered());
		model.performFly();
	}
}
