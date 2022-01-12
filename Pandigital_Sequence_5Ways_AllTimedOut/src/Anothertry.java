import java.util.Arrays;

public class Anothertry {
	public void cicaMain()	
	{
		long offset=0L;
		int size=1;
		long[] result = new long[size];
		int n=0 , put=0 ;
		long[] empty = new long[0];
		
		if( offset<0 || offset==0L )
		{
			offset=1023456788L;
		}
		else if( offset>9876543210L )
		{
			System.out.println(Arrays.toString(empty));
		}
	
		for(long i=offset ; i<9876543210L ; i++)
		{
			if(n==size)
			{
				break;
			}
			else if(isPangidital10( Long.toString(i) ))
			{
				result[n]=i;
				n++;
			}
		}	
			System.out.println(Arrays.toString(result));
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
}
