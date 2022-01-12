import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindNext {
		public static void cicaMain()
		{
		long offset = 1023456788L;
		int size=1;
		long[] empty =new long[0];
		
		List<Long> list = new ArrayList<Long>();
		
		if( offset<0L || offset==0L )
		{
			offset=1023456789L;
		}
		else if( offset>9876543210L )
		{
			System.out.println((Arrays.toString(empty)));
		}
		
		if( isPandigital10(offset) )
		{
			list.add(offset);
		}
		else
		{
			for(long i=offset ; i<9876543210L ;i++)
			{
				if( isPandigital10(i))
				{
					list.add(i);
					break;
				}
			}
		}
		for( int i =1 ; i<size ; i++)
		{
			String nextPandigital = Long.toString(offset);
			list.add(Long.parseLong( findNext( nextPandigital.toCharArray() , nextPandigital.length() ) ) );
			offset = list.get(i);
		}
		
		long[] result = new long[list.size()];
		for(int i=0 ; i< list.size() ; i++)
		{
			result[i] = list.get(i);
		}
		
		System.out.println(Arrays.toString(result));
	
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

		  public static boolean isPandigital10(long number)
		  {
		 	char[] c = String.valueOf(number).toCharArray();
		    Arrays.sort(c);
		    return Arrays.equals(c,"0123456789".toCharArray()) ;
		  }
}
