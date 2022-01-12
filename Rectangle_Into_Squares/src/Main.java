import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int lng =2;
		int lat =2;
		List<Integer> answer = new ArrayList<>();
		
		if(lng==lat || lng<0 || lat<0) //Return the array null
		{
			System.out.println(answer);
		}
		else
		{
			while( true )
			{
				if(lng>lat)
				{
					lng=lng-lat;
					answer.add(lat);
					
				}
				else if(lng<lat)
				{
					lat=lat-lng;
					answer.add(lng);
				}
				else if(lng==lat)
				{
					answer.add(lat);
					break;
				}
			}
			System.out.println(answer);
		}
	}

}
