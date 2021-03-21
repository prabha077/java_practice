package other.stringtest;

public class StrintoInteger {

	public static void main(String[] args) {
		

		String s=new String("300");
		
		int i=Integer.parseInt(s);
		int j=Integer.valueOf(s);
		
		System.out.println(i+90);
		System.out.println(s+90);
		System.out.println(j+2);

	}

}
