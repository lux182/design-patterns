package simUDuck_design;

public abstract class Duck {
	protected QuackBehavior quackBehavior;
	protected FlyBehavior flyBehavior;

	public void performQuack() {
		quackBehavior.quack();
	}

	public void performFly() {
		flyBehavior.fly();
	}

	public void swing() {
		System.out.println("All ducks float, even decoys!");
	}

	public abstract void dispaly();

}
