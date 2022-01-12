import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] input= { 10 , 9 , 3 , 2 , 1 , 4 , 8 };
		System.out.println(Arrays.toString(SortArray(input)));

	}
	
	public static int[] SortArray(int[] array)
	{
	    int temp = 0;

	    for (int i = 0; i < array.length; i++)
	    {
	        if(array[i] % 2 == 0)
	           continue;

	        for(int j = (i + 1); j < array.length; j++)
	        {
	            if(array[j] % 2 != 0)
	            {
	                if(array[i] > array[j])
	                {
	                   
	                   temp = array[i];
	                   array[i] = array[j];
	                   array[j] = temp;
	                }
	            }
	        }
	    }
	    return array;
	}
}
