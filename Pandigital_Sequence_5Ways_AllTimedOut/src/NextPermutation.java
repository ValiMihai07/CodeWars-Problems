
public class NextPermutation {

	public static void nextPermutation(int[] nums) {
		int index = nums.length - 2;

        while (index >= 0 && nums[index] >= nums[index + 1]) {
            index--;
        }
        
        if (index >= 0) {
            int larger = nums.length - 1;
            while (larger >= 0 && nums[larger] <= nums[index]) {
                larger--;
            }
            swap(nums, index, larger);
        }
        
        reverse(nums, index + 1);
    }
	
	public static void reverse(int[] nums, int start) {
		int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
	
	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
	
	public static int[] convertLI(long n)
	{
		String temp = Long.toString(n);
		int[] result = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) {
			result[i] = temp.charAt(i)-'0';
		}
		
		return result;
		
	}
	
	public static long convertIL(int[] arr)
	{
	    StringBuilder s = new StringBuilder(); 

	    for (int i : arr)
	    {
	         s.append(i); 
	    }

	    return Long.valueOf(s.toString());   
	}
}
