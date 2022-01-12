import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int lengthList=10;
		List<BigInteger> fib = new ArrayList<BigInteger>();
		List<BigInteger> pad = new ArrayList<BigInteger>();
		List<BigInteger> jac = new ArrayList<BigInteger>();
		List<BigInteger> pel = new ArrayList<BigInteger>();
		List<BigInteger> tri = new ArrayList<BigInteger>();
		List<BigInteger> tet = new ArrayList<BigInteger>();
		List<String> newStr = new ArrayList<String>();
		String[] patern = {"fib"};
		int n=10;
		BigInteger[]  resultBig = new BigInteger[n];
		BigInteger[]  resultN0 = new BigInteger[0];
		if(n==0)
		{
			System.out.println(resultN0);
		}
		else
		{
		//create list fib( Fibonacci )
		fib.add(BigInteger.valueOf(0)); fib.add(BigInteger.valueOf(1));
		for(int i=0 ; i<lengthList-1 ; i++) { fib.add( fib.get(i).add(fib.get(i+1))); }
		//create list pad( Padovan )
		pad.add(BigInteger.valueOf(1)); pad.add(BigInteger.valueOf(0)); pad.add(BigInteger.valueOf(0));
		for(int i=3 ; i<lengthList ;i++) { pad.add( pad.get(i-2).add(pad.get(i-3)) ); }
		//create list jac( Jacobsthal )
		jac.add(BigInteger.valueOf(0)); jac.add(BigInteger.valueOf(1));
		for(int i=0 ; i<lengthList-1 ; i++) { jac.add( (jac.get(i).multiply(BigInteger.valueOf(2))).add(jac.get(i+1)) ); }
		//create list pel( Pell )
		pel.add(BigInteger.valueOf(0)); pel.add(BigInteger.valueOf(1));
		for(int i=0 ; i<lengthList-1 ; i++) { pel.add( pel.get(i).add(pel.get(i+1).multiply(BigInteger.valueOf(2)))  ); }
		//create list tri ( Tribonacci )
		tri.add(BigInteger.valueOf(0)); tri.add(BigInteger.valueOf(0)); tri.add(BigInteger.valueOf(1));
		for(int i=0 ; i<lengthList-2 ; i++) { tri.add( (tri.get(i).add(tri.get(i+1))).add(tri.get(i+2))  ); }
		//create list tet ( Tetranacci )
		tet.add(BigInteger.valueOf(0)); tet.add(BigInteger.valueOf(0)); tet.add(BigInteger.valueOf(0)); tet.add(BigInteger.valueOf(1));
		for(int i=4 ; i<lengthList ; i++) { tet.add( ((tet.get(i-1).add(tet.get(i-2))).add(tet.get(i-3))).add( tet.get(i-4)) ); }
		
		// create new list with my string of length n
		for(int i=0 ; i<n ; i++)
		{
			if(i == patern.length)
			{
				n=n-i;
				i=0;
				newStr.add(patern[i]);
			}
			else
			{
				newStr.add(patern[i]);
			}
		}
		
		for(int i=0 ; i< newStr.size() ; i++)
		{
			if(newStr.get(i).equals("fib"))
			{
				resultBig[i] =fib.get(0);     
				fib.remove(0);
			}
			else if(newStr.get(i).equals("pad"))
			{
				resultBig[i] =pad.get(0);
				pad.remove(0);
			}
			else if(newStr.get(i).equals("jac"))
			{
				resultBig[i] =jac.get(0);
				jac.remove(0);
			}
			else if(newStr.get(i).equals("pel"))
			{
				resultBig[i] =pel.get(0);
				pel.remove(0);
			}
			else if(newStr.get(i).equals("tri"))
			{
				resultBig[i] =tri.get(0);
				tri.remove(0);
			}
			else if(newStr.get(i).equals("tet"))
			{
				resultBig[i] =tet.get(0);
				tet.remove(0);
			}
		}
		System.out.println(Arrays.toString(resultBig));
		}
	}

}
