
public class Main {

	public static void main(String[] args) {
		String s ="hskt svr neetn!Ti aai eyitrsig";
		String sFinal = "" ;
		int n=1;
		if(n== -1 || n==0)
		{
			System.out.println(s);
		}
		else
		{
			for(int i=0 ; i< n ; i++)
			{
				if(s.length() % 2 != 0)
				{
					for(int l=0 ; l < s.length()/2 ; l++) 
					{
						sFinal = sFinal + Character.toString(s.charAt(s.length()/2+l)) + Character.toString(s.charAt(l));
					}
					sFinal = sFinal + Character.toString(s.charAt(s.length()-1));
				}
				else if(s.length() % 2 == 0)
				{
					for(int l=0 ; l < s.length()/2 ; l++) 
					{
						sFinal = sFinal + Character.toString(s.charAt(s.length()/2+l)) + Character.toString(s.charAt(l));
					}
				}
				s=sFinal;
				sFinal="";
			}
		}
		
		
		System.out.println(s);
		
	}
}