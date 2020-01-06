
abstract class Abstract implements Interface {

public void M1(int addition) {
	int a = 0,b=0;
	int sum=0;
	
	sum = a+b;
	System.out.println("Addition of numbers is"+""+sum);
	
}
public void M2()
{
	System.out.println("Sum of two numbers is in M1");
	}public Abstract() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
		public void MI() {
			System.out.println("This is methodMI declared in inteface");
			
		}
	@Override
		public void MI2() {
			// TODO Auto-generated method stub
			System.out.println("This is public method MI2 declared in inteface");
		}
@Override
	public void MI1() {
		System.out.println("This is MI1");
		
	}


	}


