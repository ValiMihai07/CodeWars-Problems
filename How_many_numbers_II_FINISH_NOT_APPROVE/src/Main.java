import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		long nMax = 3000;
		int maxSm = 7;
		int totalSm = 0;
		int countNum = 0;
		List<Integer> meanList =new ArrayList<Integer>();
		List<Integer> diferences =new ArrayList<Integer>();
		int resultMean =0;
		int compare = (int)nMax;
		int index = 0;
		long[] finalResult = new long[3];
		for(int i =1000 ; i<= nMax ; i++)
		{
			int[] digits = Integer.toString(i).chars().map(c -> c-'0').toArray();
			for( int j =0 ; j<= digits.length-4 ; j++)
			{
				int sum =0;
				for(int k=j ; k< 4 ; k++)
				{
					sum += digits[k];
				}
				if( sum <= maxSm)
				{
					countNum++;
					totalSm += i ;
					meanList.add(i);
				}
			}
		}
		//here we see what number is closer to mean
		for(int i=0 ; i< meanList.size() ; i++)
		{
			resultMean += meanList.get(i);
		}
		resultMean = resultMean/countNum;
		for(int i=0 ; i< meanList.size() ; i++)
		{
			if( resultMean < meanList.get(i))
			{
				diferences.add( meanList.get(i)-resultMean );
			}
			else if( resultMean > meanList.get(i))
			{
				diferences.add( resultMean - meanList.get(i) );
			}
		}
		for(int i=0 ; i< diferences.size() ; i++)
		{
			if( compare > diferences.get(i))
			{
				compare = diferences.get(i);
				index =i;
			}
		}
		if(index == 0)
		{
			finalResult[0]=countNum;
			finalResult[1]=meanList.get(0);
			finalResult[2]=totalSm;
		}
		else
		{
			finalResult[0]=countNum;
			finalResult[1]=meanList.get(index);
			finalResult[2]=totalSm;
		}
		
		System.out.println(Arrays.toString(finalResult));
	}

}
