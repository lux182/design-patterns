package demo.state;

public class Main {

	public static void main(String[] args) {
		Context context = new Context();
		context.setLiftState(Context.closeingState);

		context.open();
		context.close();
		context.stop();
		context.run();
		context.open();
	}
}
