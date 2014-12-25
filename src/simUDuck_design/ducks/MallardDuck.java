package simUDuck_design.ducks;

import simUDuck_design.Duck;
import simUDuck_design.impl.FlyWithWings;
import simUDuck_design.impl.Quack;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void dispaly() {
		// TODO Auto-generated method stub
		System.out.println("I'm real Malord Duck!");
	}

}
