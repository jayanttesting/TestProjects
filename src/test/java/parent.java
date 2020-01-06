import java.io.IOException;

import Selenium.main.maininput;

public class parent {

	void msg(){
		
System.out.println("print message 1");
	}
	
	class testexceptionchild extends parent{
		void msg(){
			System.out.println("test Exception parent");
		}
		public void main(String[] args) {
			parent p = new testexceptionchild();
			p.msg();
		}
	}
}
