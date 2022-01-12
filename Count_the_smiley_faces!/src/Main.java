import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<String> a =  new ArrayList<String>();
        a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");
        
        int counter=0;
        String[] s = new String[a.size()];
        String normalS = a.stream()
        	      .map(n -> String.valueOf(n))
        	      .collect(Collectors.joining(","));
        s=normalS.split(",");
        
        for(int i=0 ; i<s.length ; i++)
        {
        	if( s[i].equals(":)")  || s[i].equals(":D")  ||
        		s[i].equals(";)")  || s[i].equals(";D")  ||
        		s[i].equals(":-)") || s[i].equals(":-D") ||
        		s[i].equals(";-)") || s[i].equals(";-D") ||
        		s[i].equals(":~)") || s[i].equals(":~D") ||
        		s[i].equals(";~)") || s[i].equals(";~D") )
        	{
        		counter++;
        	}
        }
        
        System.out.println(counter);
	}
}
