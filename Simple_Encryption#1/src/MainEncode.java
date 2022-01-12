
public class MainEncode {

	public static void main(String[] args) {
		String s ="This is a test!";
		String sPar = "" ;
		String sImpar = "";
		int n=4;
		String x;
		
		for(int i=0 ; i< n ; i++)
		{
			for(int j =0 ; j< s.length() ; j++)
			{
				x =Character.toString(s.charAt(j));
				if ( j%2==0)
				{
					sPar = sPar + x;
				}
				else if ( j%2!=0)
				{
					sImpar = sImpar + x;
				}
			}
			s=sImpar.concat(sPar);
			sPar ="";
			sImpar ="";
		}
		
		
		System.out.println(s);

	}

}
