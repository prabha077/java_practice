package other.sortingtest;

public class BubbleSortTest {
	
	public int[] bubblesort(int arr[])
	{
		
		int arry[]=arr;
		for(int i=0;i<arry.length;i++)
		{
			for(int j=i+1;j<arry.length;j++)
			{
				if(arry[i]>arry[j])
				{
					int temp=arry[i];
					arry[i]=arry[j];
					arry[j]=temp;
				}
			}
		}
		
		return arry;
		
		
	}
	
	public static void main(String[] args) {
		

		int a[]= {1,3,4,7,9,5};
		
		BubbleSortTest b=new BubbleSortTest();
		int sorted_set[]=b.bubblesort(a);
		
		for (int n=0;n<sorted_set.length;n++)
		{
			System.out.println(sorted_set[n]);
		}
		
		

	}

}
