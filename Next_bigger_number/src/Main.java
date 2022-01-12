import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		long number = 1023456789;
		char digits[] = String.valueOf(number).toCharArray();
		int n = digits.length;
		String s = findNext(digits, n);
		long result = Long.parseLong(s);
		System.out.println(result);
		
	}
	
	static void swap(char ar[], int i, int j)
    {
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
	
	static String findNext(char ar[], int n)
    {
		String s = new String() ;
        int i;
        for (i = n - 1; i > 0; i--)
        {
            if (ar[i] > ar[i - 1]) {
                break;
            }
        }
         
        if (i == 0)
        {
            return "-1";
        }
        else
        {
            int x = ar[i - 1], min = i;
            for (int j = i + 1; j < n; j++)
            {
                if (ar[j] > x && ar[j] < ar[min])
                {
                    min = j;
                }
            }
            swap(ar, i - 1, min);
            Arrays.sort(ar, i, n);
            
            for(int j=0 ; j < ar.length ; j++)
        	{
        		s = s + ar[j];
        	}
            
            return s;
        }
    }
}