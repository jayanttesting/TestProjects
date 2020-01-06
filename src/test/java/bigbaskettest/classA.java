package bigbaskettest;

public class classA {

	public static int Addtwonumbers() {
		int sum;
		int a = 1, b = 3;
		sum = a + b;
		return sum;

	}
	public static int print()
	{
		Addtwonumbers();
		return print();

	}
	public static int main(String[] args) {
		
		int mayank = print();
		System.out.println("sum is = " + mayank);
		return Addtwonumbers();
	}
}
