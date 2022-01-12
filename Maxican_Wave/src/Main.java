import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String s = " hel lo ";
		char[] sChrArr = s.toCharArray();
		List<String> sArr = new ArrayList<String>();
		for(int i=0 , k=0 ; i< s.length() ; i++)
		{
			if( sChrArr[i] == ' ' )
			{
				continue;
			}
			else
			{
				sChrArr[i] = Character.toUpperCase(sChrArr[i]);
				String s2 = String.valueOf(sChrArr);
				sArr.add(s2);
				sChrArr[i] = Character.toLowerCase(sChrArr[i]);
				
				
			}
		}
		System.out.println(sArr);
		String[] result = new String[ sArr.size() ];
		for(int i=0 ; i< sArr.size() ; i++)
		{
			result[i] = sArr.get(i);
		}
		System.out.println(Arrays.toString(result));

	}

}
