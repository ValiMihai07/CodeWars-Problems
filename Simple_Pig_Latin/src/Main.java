import java.util.Arrays;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		String str = "Pig latin is cool ?";
		String[] strArray;
		String newWord = "";
		String finalString ="";
		
		strArray = str.split(" ");
		
		if( str.contains("!") || str.contains("?") || str.contains("."))
		{
			for(int i=0 ; i< strArray.length -1 ; i++)
			{
				char[] saveStrArray;
				newWord = "";
				saveStrArray = strArray[i].toCharArray();
				for(int j=1 ; j<= saveStrArray.length-1 ; j++)
				{
					newWord += saveStrArray[j];
				}
				finalString +=newWord + saveStrArray[0] +"ay" + " ";
			}
			finalString += strArray[strArray.length-1];
		}
		else
		{
			for(int i=0 ; i< strArray.length-1 ; i++)
			{
				char[] saveStrArray;
				newWord = "";
				saveStrArray = strArray[i].toCharArray();
				for(int j=1 ; j<= saveStrArray.length-1 ; j++)
				{
					newWord += saveStrArray[j];
				}
				finalString +=newWord + saveStrArray[0] +"ay" + " ";
			}
			char[] saveStrArray;
			newWord = "";
			saveStrArray = strArray[ strArray.length-1 ].toCharArray();
			for(int j=1 ; j<= saveStrArray.length-1 ; j++)
			{
				newWord += saveStrArray[j];
			}
			finalString +=newWord + saveStrArray[0] +"ay";
		}
		System.out.println(finalString);
		
	}

}
