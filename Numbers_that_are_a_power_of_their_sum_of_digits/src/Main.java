import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int n= 1;
		ArrayList<Long> a = new ArrayList<Long>();
        for(int i=2;i<100;i++){
          for(int j=2;j<200;j++){
            long r = (long) Math.pow(i,j);
            if(sumDigits(r) == i)
                a.add(r);
          }
        }
        Collections.sort(a);
        System.out.println(a);
        System.out.println(a.get(n-1)); 
	}
	
	public static int sumDigits(long n){
	     int sum = 0;
	     while(n>0){
	       sum+=n%10;
	       n/=10;
	     }
	     return sum;
	}
}
