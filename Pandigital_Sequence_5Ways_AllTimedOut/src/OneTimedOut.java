import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OneTimedOut {
public static void solve() {
		
		long offset=0L;
		int size=1;
		long[] result = new long[size];
		int n=0 , put=0 ;
		long[] empty = new long[0];

		for(long i=offset ; i<9999999999L ; i++)
		{
			if( i<0 || i==0L )
			{
				i=1023456788L;
			}
			else if(n==size)
			{
				break;
			}
			else if(isPangidital10( Long.toString(i) ))
			{
				result[n]=i;
				n++;
				put++;
			}
		}
		
		if(put==0)
		{
			//return a empty array of long
			System.out.println(Arrays.toString(empty));
			
		}
		else
		{
			//return the list like a array of long
			
			System.out.println(Arrays.toString(result));
		}
	}
	
	public static boolean isPangidital10(String number)
	{
		if(number.length()<10)
		{
			return false;
		}
		
		boolean hash[] = new boolean[10];
	    Arrays.fill(hash, false);
	    
	    for (int i = 0; i < number.length(); i++) {
	         
	        // If digit is integer
	        if (number.charAt(i) >= '0' && number.charAt(i) <= '9')
	            hash[number.charAt(i) - '0'] = true;
	     
	        }
		
	    for (int i = 0; i < 10; i++)
	    {
	    	if (hash[i] == false)
	    	{
	    		return false;
	    	}
	    }
	    
		return true;
	}
	
	//too slow
	/*
	 * public static boolean isPangidital10(long number)
	 *	{
	 *		int digits = 0;
	 *		int expected = 1023;
	 *
	 *       for (; number > 0; number /= 10)
	 *       {
	 *           digits |= 1 << (number - ((number / 10) * 10));
	 *       }
	 *
	 *       return digits == expected;
	 *	}
	 */
	
	
	/*
	  public static boolean isPandigital10(long number)
	  {
	 	char[] c = String.valueOf(number).toCharArray();
	    Arrays.sort(c);
	    return Arrays.equals(c,"0123456789".toCharArray()) ;
	  }
	 */
}
