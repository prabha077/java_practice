package other.stringtest;

public class StrTest {

	public static void main(String[] args) {
		
	
				String s1="prabhakaran";
				char ch[]=s1.toCharArray();
				int length=ch.length;
				System.out.println(length);
						
						for(int i=length-1;i>=0;i--)
						{
						
							System.out.print(ch[i]);
						}
				
			}

	}
