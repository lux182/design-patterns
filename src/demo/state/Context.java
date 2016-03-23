package demo.state;

public class Context {

	public static OpenningState openningState;
	public static RunningState runningState;
	public static StoppingState stoppingState;
	public static CloseingState closeingState;

	public Context() {
		openningState = new OpenningState();
		runningState = new RunningState();
		stoppingState = new StoppingState();
		closeingState = new CloseingState();
	}

	private LiftState liftState;

	public LiftState getLiftState() {
		return liftState;
	}

	public void setLiftState(LiftState liftState) {
		this.liftState = liftState;
		this.liftState.setContext(this);
	}

	public void open() {
		this.liftState.open();
	}

	public void close() {
		this.liftState.close();
	}

	public void run() {
		this.liftState.run();
	}

	public void stop() {
		this.liftState.stop();
	}
}
