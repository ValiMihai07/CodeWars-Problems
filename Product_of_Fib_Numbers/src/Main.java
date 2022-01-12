import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		long prod =3;
		long[] answer = new long[3];
		List<Long> listFibo = new ArrayList<Long>();
		listFibo.add((long)0);
		listFibo.add((long)1);
		System.out.println(Arrays.toString(answer));
		if(prod ==0)
		{
			answer[0] = listFibo.get(0) ;
			answer[1] = listFibo.get(1);
			answer[2] = 0;
			System.out.println(Arrays.toString(answer));
		}
		else
		{
		for(int i=0 ; i < prod*2 ; i++)
		{
			listFibo.add(listFibo.get(i)+listFibo.get((i+1)));
			if( listFibo.get(i)*listFibo.get((i+1)) == prod )
			{
				answer[0] = listFibo.get(i) ;
				answer[1] = listFibo.get((i+1));
				answer[2] = 1;
				break;
				//return answer;
			}
			else if(listFibo.get(i)*listFibo.get((i+1)) < prod && listFibo.get(i+1)*listFibo.get((i+2)) > prod)
			{
				answer[0] = listFibo.get(i+1) ;
				answer[1] = listFibo.get((i+2));
				answer[2] = 0;
				break;
			}
			else if(listFibo.get(i)*listFibo.get((i+1)) > prod )
			{
				answer[0] = listFibo.get(i) ;
				answer[1] = listFibo.get((i+1));
				answer[2] = 0;
				break;
			}
		}
		System.out.println(Arrays.toString(answer));
		System.out.println(listFibo);
		}
	}

}
