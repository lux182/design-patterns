package demo.flyweight;

public class Client {

	public static void main(String[] args) {
		FlyWeightFactory factory = new FlyWeightFactory();
		FlyWeight fly = factory.factory(new Character('a'));
		fly.operation("first call");
		fly = factory.factory(new Character('b'));
		fly.operation("second call");
		fly = factory.factory(new Character('c'));
		fly.operation("third call");
		fly = factory.factory(new Character('a'));
		fly.operation("fourth call");

	}
}
