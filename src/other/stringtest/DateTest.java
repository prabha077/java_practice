package other.stringtest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		

		String d="31/DEC/2030";
		String df="poki";
		Date dd;
		try {
			dd = new SimpleDateFormat("dd/MMM/yyyy").parse(d);
			System.out.println(dd);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
