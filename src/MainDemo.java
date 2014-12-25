public class MainDemo implements TestInterface {

	public static void main(String[] args) {
		MainDemo md = new MainDemo();
		md.excute();

	}

	private void excute() {
		SayInstance.getInstance().setTestInterface(this);
		SayInstance.getInstance().addMessge();

	}

	@Override
	public void sayeHello(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
	}

}
