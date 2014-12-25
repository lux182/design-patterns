package simUDuck_design.ducks;

import simUDuck_design.Duck;
import simUDuck_design.impl.FlyNoWay;
import simUDuck_design.impl.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void dispaly() {
		// TODO Auto-generated method stub
		System.out.println("I'm a model duck");
	}

}
