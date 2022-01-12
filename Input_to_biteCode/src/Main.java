
public class Main {

	public static void main(String[] args) {
		int x = 7 ;
		int answer=0;
		String s;
		s=Integer.toBinaryString(x);
		for(int i=0 ; i<s.length() ; i++)
		{
			 if(s.charAt(i) == '1')
			 {
				 answer++; 
			 }
		}
			
			
		System.out.println(answer);
	}

}
