package demo.state;

public class OpenningState extends LiftState {

	@Override
	public void open() {
		System.out.println("lift open...");
	}

	@Override
	public void close() {
		
		this.context.setLiftState(Context.closeingState);
		this.context.getLiftState().close();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

}
