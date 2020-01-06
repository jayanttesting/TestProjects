
public class Test {

	private static Test run;

	private Test() {

	}

	public synchronized static Test getinstance() {
		if (run == null)
			run = new Test();
		return run;
	}

	public int getaddition(int a, int b) {
		return a + b;
	}
}
