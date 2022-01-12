import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	String[][] reels = { {"Wild", "Star", "Bell", "Shell", "Seven",
        				  "Cherry", "Bar", "King", "Queen", "Jack"},
						 {"Wild", "Star", "Bell", "Shell", "Seven",
                          "Cherry", "Bar", "King", "Queen", "Jack"},
						 {"Wild", "Star", "Bell", "Shell", "Seven",
                          "Cherry", "Bar", "King", "Queen", "Jack"}};
	int[] spins = {0, 0, 0};
	List<String> arrResult = new ArrayList<String>();
	int countWild=0;
	int countStar=0;
	int countBell=0;
	int countShell=0;
	int countSeven=0;
	int countCherry=0;
	int countBar=0;
	int countKing=0;
	int countQueen=0;
	int countJack=0;
	for(int i=0 ; i<3 ; i++)
	{
		arrResult.add( reels[i][ spins[i] ] );
	}
	System.out.println(arrResult);
	
	for(int i=0 ; i<3 ;i++)
	{
		if( arrResult.get(i).equals("Wild") )
		{
			countWild++;
		}
		else if( arrResult.get(i).equals("Star"))
		{
			countStar++;
		}
		else if( arrResult.get(i).equals("Bell"))
		{
			countBell++;
		}
		else if( arrResult.get(i).equals("Shell"))
		{
			countShell++;
		}
		else if( arrResult.get(i).equals("Seven"))
		{
			countSeven++;
		}
		else if( arrResult.get(i).equals("Cherry"))
		{
			countCherry++;
		}
		else if( arrResult.get(i).equals("Bar"))
		{
			countBar++;
		}
		else if( arrResult.get(i).equals("King"))
		{
			countKing++;
		}
		else if( arrResult.get(i).equals("Queen"))
		{
			countQueen++;
		}
		else if( arrResult.get(i).equals("Jack"))
		{
			countJack++;
		}
	}
	if(countWild==3)
	{
		System.out.println("100");
	}
	else if(countWild==2)
	{
		System.out.println("10");
	}
	else if(countStar==3)
	{
		System.out.println("90");
	}
	else if(countStar==2)
	{
		if(countWild==1)
		{
			System.out.println("18");
		}
		else
		{
			System.out.println("9");
		}
	}
	else if(countBell==3)
	{
		System.out.println("80");
	}
	else if(countBell==2)
	{
		if(countWild==1)
		{
			System.out.println("");
		}
		else
		{
			System.out.println("8");
		}
	}
	else if(countShell==3)
	{
		System.out.println("70");
	}
	else if(countShell==2)
	{
		if(countWild==1)
		{
			System.out.println("14");
		}
		else
		{
			System.out.println("7");
		}
	}
	else if(countSeven==3)
	{
		System.out.println("60");
	}
	else if(countSeven==2)
	{
		if(countWild==1)
		{
			System.out.println("12");
		}
		else
		{
			System.out.println("6");
		}
	}
	else if(countCherry==3)
	{
		System.out.println("50");
	}
	else if(countCherry==2)
	{
		if(countWild==1)
		{
			System.out.println("10");
		}
		else
		{
			System.out.println("5");
		}
	}
	else if(countBar==3)
	{
		System.out.println("40");
	}
	else if(countBar==2)
	{
		if(countWild==1)
		{
			System.out.println("8");
		}
		else
		{
			System.out.println("4");
		}
	}
	else if(countKing==3)
	{
		System.out.println("30");
	}
	else if(countKing==2)
	{
		if(countWild==1)
		{
			System.out.println("6");
		}
		else
		{
			System.out.println("3");
		}
	}
	else if(countQueen==3)
	{
		System.out.println("20");
	}
	else if(countQueen==2)
	{
		if(countWild==1)
		{
			System.out.println("4");
		}
		else
		{
			System.out.println("2");
		}
	}
	else if(countJack==3)
	{
		System.out.println("10");
	}
	else if(countJack==2)
	{
		if(countWild==1)
		{
			System.out.println("2");
		}
		else
		{
			System.out.println("1");
		}
	}
	
	
	
	}
}
