package demo.flyweight;

public class ConcreteFlyWeight implements FlyWeight {

	private Character intrinsicState;

	public ConcreteFlyWeight(Character state) {
		this.intrinsicState = state;
	}

	@Override
	public void operation(String state) {

		System.out.println("intrinsic state = " + this.intrinsicState);
		System.out.println("extrinsic state = " + state);

	}

}
