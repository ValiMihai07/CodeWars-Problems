import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
	// public static int tour(String[] arrFriends, String[][] ftwns, Map<String, Double> h)
		
	String[] friends1 = new String[] { "A1", "A2", "A3", "A4", "A5" };
	String[][] fTowns1 = { new String[] {"A1", "X1"} };
	Map<String, Double> distTable1 = new HashMap<String, Double>();
	distTable1.put("X1", 100.0); distTable1.put("X2", 200.0); distTable1.put("X3", 250.0); 
	distTable1.put("X4", 300.0);
	List<Double> distSorted = new ArrayList<>();
	double answer =0;
	for(int i=0 , k=0 ; i< friends1.length ; i++)
	{
		for(int j = 0 ; j < fTowns1.length ; j++)
		{
			if( friends1[i].equals(fTowns1[j][0]))
			{
				distSorted.add(distTable1.get(fTowns1[j][1])) ;
				k++;
			}
		}
	}
	if( distSorted.size() == 1 )
	{
		answer = distSorted.get(0)*2;
	}
	else
	{
		for(int j=0 ; j< distSorted.size() ; j++)
		{
			if( j != distSorted.size()-1)
			{
				answer += Pitagora(distSorted.get(j), distSorted.get(j+1));
			}
		}
		answer += distSorted.get(0);
		answer += distSorted.get( distSorted.size()-1 );
	}
	
	System.out.println(answer);
	
}
	public static double Pitagora ( double cateata , double ipotenuza)
	{
		double catetaAnswer =0;
		// i*2 = c*2 + c2*2
		
		catetaAnswer = (Math.sqrt( Math.pow(ipotenuza, 2) - Math.pow(cateata, 2) ));
		
		return catetaAnswer ;
	}
}
