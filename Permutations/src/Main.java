import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	static String globalStr = "";
	static String finalStr = "";
	
	public static void main(String[] args) {
		
		String s = "aabb";
		System.out.println(getPermutation(s));
		Set<String> permutations = getPermutation(s);
		
		String[] array = new String[permutations.size()];
		
        int i = 0;
        for (String each: permutations) {
            array[i++] = each;
        }
        
        List<String> myList = new ArrayList<String>(Arrays.asList(array));
        System.out.println(Arrays.toString(array));
	
	}
	
	private static void findDublicare(String globalStr2) {
		
		String[] answer = globalStr2.split(" ");
		System.out.println(Arrays.toString(answer));
		for(int i=0 ; i<answer.length ; i++)
		{
			for( int j= i+1 ; j<answer.length ; j++)
			{
				if(answer[i].equals(answer[j]))
				{
					answer[j]="";
				}
			}
		}
		System.out.println(Arrays.toString(answer));
		for(int k=0 ; k< answer.length ; k++)
		{
			if( answer[k].equals(""))
			{
				continue;
			}
			else
			{
				finalStr += answer[k] + " ";
			}
		}
		
	}

	// with dublicates
	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) globalStr += prefix + " ";
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
	
	// without dublicates
	static void distinctPermutation(String str, String ans)
	{
		if (str.length() == 0) 
		{
			globalStr += ans + " ";
		}
		else
		{
			boolean alpha[] = new boolean[26];
			
			for (int i = 0; i < str.length(); i++) 
			{				
				char ch = str.charAt(i);
				
				String ros = str.substring(0, i) + 
				str.substring(i + 1);
				
				if (alpha[ch - 'a'] == false)
					distinctPermutation(ros, ans + ch);
				alpha[ch - 'a'] = true;
			}
		}
	}
	
	// another example
	public static Set<String> getPermutation(String str) {

	    Set<String> permutations = new HashSet<String>();
 
	    if (str == null) {
	      return null;
	    } else if (str.length() == 0) {
	      
	      permutations.add("");
	      return permutations;
	    }

	    char first = str.charAt(0);

	    String sub = str.substring(1);

	    Set<String> words = getPermutation(sub);

	    for (String strNew : words) {
	      for (int i = 0;i<=strNew.length();i++){

	        permutations.add(strNew.substring(0, i) + first + strNew.substring(i));
	      }
	    }
	    return permutations;
	}
}
