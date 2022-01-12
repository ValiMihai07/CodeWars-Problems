 // finish but not approved
public class Main {

	public static void main(String[] args) {
		double[] arr = {1, 1, 1, 1, 1, 2};
		int index=0;
		for(int i = 0 ; i < arr.length-1 ; i++)
		{
			if( arr[0]!=arr[i] && arr[i]!=arr[i+1] )
			{
				index=i+1;
			}
			else if( arr[0]!=arr[i] && arr[i]==arr[i+1] )
			{
				index =1;
			}
		}
		if(index==0)
		{
			System.out.println(arr[ arr.length-1 ]);
		}
		else
		{
			System.out.println(arr[ index-1 ]);
		}

	}
}
