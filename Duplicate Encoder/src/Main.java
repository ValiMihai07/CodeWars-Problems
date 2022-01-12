
public class Main {

	public static void main(String[] args) {
		
		/* The goal of this exercise is to convert a string to a new string where each character 
		in the new string is "(" if that character appears only once in the original string
		, or ")" if that character appears more than once in the original string. 
		Ignore capitalization when determining if a character is a duplicate.
		*/
		
		String s = "Prespecialized";
		s = s.toLowerCase();
		int countResult =0;
		char[] comp = s.toCharArray();
		String finalString = new String();
		
		for(int i =0 ; i< s.length() ; i++)
		{
			countResult = 0 ;
			for(int j=0 ; j< s.length() ; j++)
			{
				if( s.charAt(j) == comp[i] )
				{
					countResult++;
				}
			}
			if( countResult > 1)
			{
				finalString = finalString + ")";
			}
			else if( countResult == 1)
			{
				finalString = finalString + "(";
			}
		}
		System.out.println(finalString);
	}

}
