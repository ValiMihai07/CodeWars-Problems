import java.time.Duration;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int v1 =80;
		int v2 =91;
		int g =37;
		
		double a =v1;
		double b =v2;
		double avantage =g;
		
		
		if(a<=0 || b<=0 || avantage <=0 || b<a )
	      {
	        System.out.println("");;
	      }
		else
		{
		    double takttime = avantage/(b-a); 
		    
		    System.out.println(takttime);
		    
		    double nanos = takttime * Duration.ofHours(1).toNanos();
		    Duration dur = Duration.ofNanos(Math.round(nanos));
		    
		    int hours = (int)dur.toHours();
		    int minutes = dur.toMinutesPart();
		    int seconds = dur.toSecondsPart();
		    
		    int[] intArray = {  hours , minutes ,  seconds } ;
		 
		    System.out.println(Arrays.toString(intArray));
		}
	}
}
