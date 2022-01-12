
public class Main {

	public static void main(String[] args) {
		String s= " camel case word" ;
		String[] strArray = s.split(" ");
		String finalString = "";

			for(int i=0 ; i<strArray.length ; i++)
			{
				if(strArray[i].equals(""))
				{
					continue;
				}
				else
				{
					char firstChar = Character.toUpperCase(strArray[i].charAt(0));
					finalString += strArray[i].replaceFirst( Character.toString(strArray[i].charAt(0)) ,  Character.toString(firstChar) );
				}
				
			}
		System.out.println(finalString);
	}

}
