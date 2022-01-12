
public class Main {

	public static void main(String[] args) {
		int n = 9;
		
        if (n <= 1)
            System.out.println(false);
 
        else if (n == 2)
        	System.out.println(true);
 
        else if (n % 2 == 0)
        	System.out.println(false);

        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
            	System.out.println(false);
        }
        
        System.out.println(true);
		// function with replace sysout with return
	}

}
