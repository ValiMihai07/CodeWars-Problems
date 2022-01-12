
public class Main {
	// see how many dublicates are in a string
	public static void main(String[] args) {
		String s = "freer";
		s = s.toLowerCase();
		String dublicates = "";
		String characters = "";
		
		for(int i=0 ; i< s.length() ; i++)
		{
			String curent = Character.toString( s.charAt(i));
			if(characters.contains(curent))
			{
				if(!dublicates.contains(curent))
				{
					dublicates += curent;
				}
			}
			characters += curent;
		}
		System.out.println(dublicates.length());
	}

}
