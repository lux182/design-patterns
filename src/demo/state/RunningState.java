package demo.state;

public class RunningState extends LiftState {

	@Override
	public void open() {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {

		System.out.println("lift run...");
	}

	@Override
	public void stop() {

		this.context.setLiftState(Context.stoppingState);
		this.context.getLiftState().stop();
	}

}
