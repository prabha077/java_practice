package other.general;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Date_test {

	public static void main(String[] args) {

		String df = "dd-mm-yyyy";

		SimpleDateFormat sdf = new SimpleDateFormat(df);

		String date = sdf.format(new Date());

		System.out.println(date);
		

		ArrayList<Integer> tt = new ArrayList<Integer>();
		tt.add(1);
		tt.add(2);
		tt.add(3);
		
		System.out.println(tt.get(1));
		tt.remove(1);
		System.out.println(tt.get(1));

	}

}
