import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		String[] s = {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" ,"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" , "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" ,"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST", "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};

		for(int i=0 ; i<s.length ; i++)
		{
			s = resolveProblem(s);
		}
		System.out.println(Arrays.toString(s));
	}

	private static String[] resolveProblem(String[] s) {
		List<String> list = new ArrayList<String>(Arrays.asList(s));
		List<Integer> listInt = new ArrayList<Integer>();
		list.add("final");

		for(int i=0 ; i< list.size() ; i++)
		{
			if( (list.get(i).equals("NORTH") && list.get(i+1).equals("SOUTH")) ||
				(list.get(i).equals("SOUTH") && list.get(i+1).equals("NORTH")) ||
				(list.get(i).equals("EAST")  && list.get(i+1).equals("WEST")) ||
				(list.get(i).equals("WEST")  && list.get(i+1).equals("EAST")) )
			{
				listInt.add(i);
				listInt.add(i+1);
			}
		}
		for(int j =0 ; j<listInt.size() ; j++)
		{
			list.set( listInt.get(j) , null);
		}
		list.remove(list.size()-1);
		s = list.toArray(new String[0]);

		list.clear();
		for(int k=0 ; k<s.length ; k++)
		{
			if(s[k] != null)
			{
				list.add(s[k]);
			}
		}
		s = list.toArray(new String[0]);
		return s;
	}
}

	//nu intra in a doua incercare de micsorare a drumului
	/*
	static final String sNorth = "NORTH" ;
	static final String sSouth = "SOUTH" ;
	static final String sEast = "EAST" ;
	static final String sWest = "WEST" ;
	static final String sNull = null;
	
	public static void main(String[] args) {
		String[] sFirst = { "NORTH" , "SOUTH" , "WEST" , "SOUTH" , "NORTH", "EAST"};
		sFirst = strFctComplete(sFirst);
		sFirst = strFctComplete(sFirst);
		System.out.println(Arrays.toString(sFirst));
	}

	private static String[] strFctComplete(String[] s) {
		for(int k=0 ; k< s.length ; k++)
		{
			String answer ="";
			for(int i=0 ; i< s.length-1 ; i++)
			{
				if( (s[i]==sNorth && s[i+1]==sSouth) ||
					(s[i]==sSouth && s[i+1]==sNorth) ||
					(s[i]==sEast && s[i+1]==sWest) ||
					(s[i]==sWest && s[i+1]==sEast) )
				{
					s[i]="";
					s[i+1]="";
					i++;	
				}
			}
			for(int j=0 ; j< s.length ; j++)
			{
				if(s[j] != "")
				{
					answer = answer + s[j] + ",";
				}
				
			}
			
			if(answer.isEmpty())
			{
				s = null;
			}
			else 
			{
				s = answer.split(",");
			}
		}
		
		return s;
	} */

