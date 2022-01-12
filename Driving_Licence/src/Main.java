import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String[] input = new String[]{"John",    "James",  "Smith", "01-Jan-2000",       "M"};
		String result= "";
		String[] date = input[3].split("-");
		// 1-5
		for(int i=0 ; i<input[2].length() ;i++)
		{
			char[] charArr= input[2].toCharArray(); 
			if(i==5)
			{
				break;
			}
			else
			{
				result += Character.toUpperCase(charArr[i]) ;
			}
		}
		if(result.length() < 5)
		{
			int size = result.length();
			for(int i=0 ; i< 5-size ;i++)
			{
				result += "9";
			}
		}
		System.out.println(result);
		//6
		char[] charArr6 = date[2].toCharArray();
		result += charArr6[ charArr6.length-2 ];
		System.out.println(result);
		//7-8
		if(input[4].equals("F"))
		{
			if( date[1].equals("Jan") || date[1].equals("Jan") )
			{
				result += "51";
			}
			else if(date[1].equals("Feb") || date[1].equals("February"))
			{
				result += "52";
			}
			else if(date[1].equals("Mar") || date[1].equals("March"))
			{
				result += "53";
			}
			else if(date[1].equals("Apr") || date[1].equals("April"))
			{
				result += "54";
			}
			else if(date[1].equals("May"))
			{
				result += "55";
			}
			else if(date[1].equals("Jun") || date[1].equals("June"))
			{
				result += "56";
			}
			else if(date[1].equals("Jul") || date[1].equals("July"))
			{
				result += "57";
			}
			else if(date[1].equals("Aug") || date[1].equals("August"))
			{
				result += "58";
			}
			else if(date[1].equals("September") || date[1].equals("Sep"))
			{
				result += "59";
			}
			else if(date[1].equals("Oct") || date[1].equals("October"))
			{
				result += "60";
			}
			else if(date[1].equals("Nov") || date[1].equals("November"))
			{
				result += "61";
			}
			else if(date[1].equals("Dec") || date[1].equals("December"))
			{
				result += "62";
			}
		}
		else
		{
			if( date[1].equals("Jan") || date[1].equals("Jan"))
			{
				result += "01";
			}
			else if(date[1].equals("Feb") || date[1].equals("February"))
			{
				result += "02";
			}
			else if(date[1].equals("Mar") || date[1].equals("March"))
			{
				result += "03";
			}
			else if(date[1].equals("Apr") || date[1].equals("April"))
			{
				result += "04";
			}
			else if(date[1].equals("May") )
			{
				result += "05";
			}
			else if(date[1].equals("Jun") || date[1].equals("June"))
			{
				result += "06";
			}
			else if(date[1].equals("Jul") || date[1].equals("July"))
			{
				result += "07";
			}
			else if(date[1].equals("Aug") || date[1].equals("August"))
			{
				result += "08";
			}
			else if(date[1].equals("September") || date[1].equals("Sep"))
			{
				result += "09";
			}
			else if(date[1].equals("Oct") || date[1].equals("October"))
			{
				result += "10";
			}
			else if(date[1].equals("Nov") || date[1].equals("November"))
			{
				result += "11";
			}
			else if(date[1].equals("Dec") || date[1].equals("December"))
			{
				result += "12";
			}
		}
		System.out.println(result);
		//9-10
		result += date[0];
		System.out.println(result);
		//11
		result += date[2].charAt(3);
		System.out.println(result);
		//12-13
		result += input[0].charAt(0);
		if(input[1]=="") 
		{
			result += "9";
		}
		else
		{
			result += input[1].charAt(0);
		}
		System.out.println(result);
		//14-15-16
		result += "9AA";
		System.out.println(result);
	}

}
