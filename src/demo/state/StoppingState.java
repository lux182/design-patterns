package demo.state;

public class StoppingState extends LiftState {

	@Override
	public void open() {

		this.context.setLiftState(Context.openningState);
		this.context.getLiftState().open();
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {

		this.context.setLiftState(Context.runningState);
		this.context.getLiftState().run();
	}

	@Override
	public void stop() {

		System.out.println("lift stop...");
	}

}
