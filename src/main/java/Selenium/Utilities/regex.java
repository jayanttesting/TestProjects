package Selenium.Utilities;

import com.mifmif.common.regex.Generex;

public class regex {

	public String getrandomstring() {
		Generex gen = new Generex("[0-9]([a-c]|[e-g]{1,2})[A-V]");
		String ranstr = gen.random();
		System.out.println(ranstr);
		return ranstr;
	}
}
