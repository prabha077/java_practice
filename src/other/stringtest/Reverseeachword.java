package other.stringtest;

public class Reverseeachword {
	
	public String reversewordfunc(String str)
	{
		String s[]=str.split("\\s");
		String reverse="";
		
		for(String ss:s)
		{
			StringBuilder sb=new StringBuilder(ss);
			sb.reverse();
			reverse += sb +" ";
		}
		
		return reverse;
	}

	public static void main(String[] args) {
		
		Reverseeachword obj=new Reverseeachword();
		String rev=obj.reversewordfunc("this is prabha");
		System.out.println(rev);

	}

}
