/**
 * 
 */

/**
 * @author louis
 *
 */
public class SayInstance {
	private static SayInstance _INSTANCE = new SayInstance();

	private SayInstance() {

	}

	public static SayInstance getInstance() {
		return _INSTANCE;

	}

	public void addMessge(){
		if(testInterface!=null){			
			testInterface.sayeHello("fuck off");
		}
	}
	private TestInterface testInterface;

	public TestInterface getTestInterface() {
		return testInterface;
	}

	public void setTestInterface(TestInterface testInterface) {
		this.testInterface = testInterface;
	}
}
