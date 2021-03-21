package other.stringtest;

public class palindrometest {

	public static void main(String[] args) {
		
StringBuilder s1=new StringBuilder("prabha");
StringBuilder s2=s1.reverse();
System.out.println(String.format("%s %s", s1.reverse(),s2));
if(s1==s2)
	System.out.println("true");
		
	}

}
