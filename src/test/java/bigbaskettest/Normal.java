package bigbaskettest;

public class Normal implements myinterface {

	public void boy() {
		System.out.println("Unimplemented Methods");
	}

	public void girl() {
		System.out.println("Uimplemeted Girl");

	}

	public static void main(String[] args) {
		Normal n = new Normal();
		n.boy();
		n.girl();
	}
}
