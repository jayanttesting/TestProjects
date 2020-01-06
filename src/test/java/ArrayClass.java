import java.util.Arrays;

import Selenium.Utilities.regex;

public class ArrayClass implements InterfaceClass {

	public void getarray() {
		
	String[] myarray = new String[5];
	for(int i = 0;i<myarray.length;i++){
		regex reg = new regex();
		myarray[i] = reg.getrandomstring();
	}
	
//	int index_position = 2;
//	String newValue = "Jayant";
//	
//	System.out.println("Orignal Array :" +Arrays.toString(myarray));
//	
//	for(int i =myarray.length-1;i>index_position;i--)
//	{
//		myarray[i]=myarray[i-1];
//	}
//	myarray[index_position] = newValue;
//	System.out.println("new Array : " +Arrays.toString(myarray));
	}
		

	public void linkedlist() {
		// TODO Auto-generated method stub
		
	}

	public void listener() {
		// TODO Auto-generated method stub
		
	}
	
}
