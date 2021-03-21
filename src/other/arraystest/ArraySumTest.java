package other.arraystest;

public class ArraySumTest {
	
  public int[] twoSum(int[] nums, int target) {
        
        int[] result=new int[2];
        int[] input=nums;
       
        int count=nums.length;
        
       for(int i=0;i<count;i++)
       {
    	   for(int j=i+1;j<count;j++)
    	   {
    		   if (nums[i]+nums[j]==target)
    		   {
    			   result= new int[]{nums[i],nums[j]};
    			   break;
    		   }
    	   }
       }
        
        return result;
        
    }

	public static void main(String[] args) {
		
		
		ArraySumTest obj = new ArraySumTest();
		
		int[] final_result= obj.twoSum(new int[]{-3,-4,6,7},9);
		
		for (int s=0;s<final_result.length;s++)
		{
			System.out.println(final_result[s]);
		}
		

	}

}
