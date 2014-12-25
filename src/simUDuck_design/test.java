package simUDuck_design;

import org.junit.Test;

import simUDuck_design.ducks.MallardDuck;

public class test {

	@Test
	public void test() {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		//fail("Not yet implemented");
		
	}

}
