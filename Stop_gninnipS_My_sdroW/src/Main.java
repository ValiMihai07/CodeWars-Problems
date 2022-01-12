
public class Main {

	public static void main(String[] args) {
		String str = "This is another test";
		String[] strSplit = str.split(" ");
		str="";
		for(int i=0 ; i< strSplit.length ; i++)
		{
			if( strSplit[i].length() >=5 )
				strSplit[i] = changeOrder(strSplit[i]);
		}
		for(int j=0 ; j< strSplit.length ; j++)
		{
			if(j==0)
			{
				str = str + strSplit[j];
			}
			else
			{
				
				str = str + " " + strSplit[j];
			}
		}
		System.out.println(str);
	}

	private static String changeOrder(String string) {
		String newStr = "";
		char[] convStr = string.toCharArray();
		for(int i=string.length()-1 ; i >=0 ; i--)
		{
			newStr = newStr + convStr[i];
		}
		return newStr;
	}

}
