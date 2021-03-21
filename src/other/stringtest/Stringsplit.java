package other.stringtest;

public class Stringsplit {

	public static void main(String[] args) {
		
		
		
	String ss="prabhakaran";
	System.out.println(ss.substring(2, 5));

		
		String s="prabha is a tester";
		String words[]=s.split("\\s");
		int n=words.length;
		
		
		for(int i=0;i<n;i++)
		{
			System.out.println(words[i]);
		}
		
	}

}
