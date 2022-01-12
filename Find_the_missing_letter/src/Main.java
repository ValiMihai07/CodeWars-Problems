
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] input = {'A','B','C','D','F'};
		char answer;
		for(int i = input[0] , j=0 ; i < input[input.length-1] ; i++ )
		{
			if(input[j++] != i)
			{
				System.out.println( answer = (char)i );
				break;
			}
		}
	}

}
