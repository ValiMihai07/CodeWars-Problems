import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		String[] s = { "ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh" };
		int k = 1;
		
		if(s.length == 0 || k>s.length || k<=0)
		{
			System.out.println("");
		}
		else
		{
			String[] strAdd= new String[s.length-k+1];
			
			for(int i=0 ; i<=s.length-k ;i++)
			{
				StringBuilder builder = new StringBuilder();
				for( int j =0 ; j<k ; j++) {
					builder.append(s[i+j]); 
				}
				String str = builder.toString();
				strAdd[i] = str;
			}
			
			System.out.println( Arrays.toString(strAdd) );
			int[] lengthSave = new int[strAdd.length] ;
			for(int l=0 ; l<strAdd.length ; l++)
			{
				lengthSave[l]= strAdd[l].length();
			}
			int comp =0;
			int index=0;
			for(int c=0 ; c < lengthSave.length ; c++)
			{
				if( lengthSave[c] > comp)
				{
					comp=lengthSave[c];
					index = c;
				}
			}
			
			System.out.println(strAdd[index]);
		}
	}	
}
	


	// finish but not approved
	// this code broke down at k>100
	/*
	public static void main(String[] args) {

		String[] star = {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"};
		int k=1;
		String useK = "";
		int n= star.length ;
		int index=0;
		int l=k;
		int m;
		int[] arrLen = new int[n];
		if( k>n || n==0 || k<=0 )
		{
			System.out.println("");
		}
		else
		{	
			if(k%2 ==0) 
			{
			for(int i =0 ; i< n-(k-1) ; i++)
			{
				m=i;
				while(l>0)
				{
					useK = useK + star[m];
					m++;
					l--;
				}
				l=k;
				arrLen[i] = useK.length();
				useK="";
			}
			int compInt = arrLen[0];
			for(int j=1; j<arrLen.length ; j++  )
			{
				if( compInt < arrLen[j])
				{
					compInt = arrLen[j];
					index=j;
				}
				else if( compInt == arrLen[j])
				{
					arrLen[j]=0;
				}
			}
			while(k>0)
			{
				useK = useK + star[index];
				index++;
				k--;
			}
			System.out.println(useK);
			}
			
			else
			{
				for(int i =0 ; i< n-(n%k) ; i++)
				{
					m=i;
					while(l>0)
					{
						useK = useK + star[m];
						m++;
						l--;
					}
					l=k;
					arrLen[i] = useK.length();
					useK="";
				}
				int compInt = arrLen[0];
				for(int j=1; j<arrLen.length ; j++  )
				{
					if( compInt < arrLen[j])
					{
						compInt = arrLen[j];
						index=j;
					}
					else if( compInt == arrLen[j])
					{
						arrLen[j]=0;
					}
				}
				while(k>0)
				{
					useK = useK + star[index];
					index++;
					k--;
				}
				System.out.println(useK);
			}
		}	
	}
	*/

