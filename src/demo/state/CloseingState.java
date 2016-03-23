package demo.state;

public class CloseingState extends LiftState {

	@Override
	public void open() {

		this.context.setLiftState(Context.openningState);
		this.context.getLiftState().open();
	}

	@Override
	public void close() {

		System.out.println("lift close...");
	}

	@Override
	public void run() {

		this.context.setLiftState(new RunningState());
		this.context.getLiftState().run();
	}

	@Override
	public void stop() {

		this.context.setLiftState(Context.stoppingState);
		this.context.getLiftState().stop();
	}

}
