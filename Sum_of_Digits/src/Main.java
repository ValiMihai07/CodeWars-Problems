
public class Main {

	public static void main(String[] args) {
		int num = 493193 ;
		int sum = 0 ;
		sum = addDigits(num);
		while(sum>9)
		{
			sum=addDigits(sum);
		}
		System.out.println(sum);
	}

	private static int addDigits(int sum) {
		int num = 0;
		while (sum > 0) {
            num = num + sum % 10;
            sum = sum / 10;
        }
		return num;
	}

}
