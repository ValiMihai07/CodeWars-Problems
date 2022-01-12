import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		long offset = 9000000000L;
		int size=1;
		long[] empty =new long[0];
		List<Long> list = new ArrayList<Long>();
		long first = 1023456789L;
		
		if( offset>9876543210L )
		{
			System.out.println((Arrays.toString(empty)));
		}
		
		Comparator(offset, first);
		
		while (first < offset)
		{
			if(first==offset)
			{
				break;
			}
			String firstStr = Long.toString(first);
			first = Long.parseLong( findNext( firstStr.toCharArray() , firstStr.length() ) ) ;
			System.out.println(first);
		}
		
		list.add(first);
		for( int i =1 ; i<size ; i++)
		{
			String nextPandigital = Long.toString(first);
			list.add(Long.parseLong( findNext( nextPandigital.toCharArray() , nextPandigital.length() ) ) );
			first = Long.parseLong( findNext( nextPandigital.toCharArray() , nextPandigital.length() ) ) ;
		}
		
		long[] result = new long[list.size()];
		for(int i=0 ; i< list.size() ; i++)
		{
			result[i] = list.get(i);
		}
		
		//System.out.println(Arrays.toString(result));
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
	
	static void Comparator(long offset , long first )
	{
		if(offset>1 && offset<2000000000L)
		{
			first = 1023456789L;
		}
		else if(offset>2000000000L && offset<3000000000L)
		{
			first = 2013456789L;
		}
		else if(offset>3000000000L && offset<4000000000L)
		{
			first = 3012456789L;
		}
		else if(offset>4000000000L && offset<5000000000L)
		{
			first = 4012356789L;
		}
		else if(offset>5000000000L && offset<6000000000L)
		{
			first = 5012346789L;
		}
		else if(offset>6000000000L && offset<7000000000L)
		{
			first = 6012345789L;
		}
		else if(offset>7000000000L && offset<8000000000L)
		{
			first = 7012345689L;
		}
		else if(offset>8000000000L && offset<9000000000L)
		{
			first = 8012345679L;
		}
		else if(offset>9000000000L)
		{
			first = 9012345678L;
		}
	}
}
