
public class Main {

	public static void main(String[] args) {
		int n = 86240;
		String s;
		s = primeFactors(n);
		System.out.println(s);
	}
	
	public static String primeFactors(int n)
    {
		int counter=0;
		String str ="";

        while (n%2==0)
        {
            n /= 2;
            counter++;
        }
        if(counter==0)
        {
        }
        else if(counter==1)
        {
        	str += "(2)";
        }
        else
        {
        	str += "(2**" + counter + ")";
        }
        

        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            counter =0;// While i divides n, print i and divide n
            while (n%i == 0)
            {
                n /= i;
                counter++;
            }
            if(counter==0)
            {
            	
            }
            else if(counter==1)
            {
            	str += "("+ i +")";
            }
            else
            {
            	str += "(" + i + "**" + counter + ")";
            }
        }
        if (n > 2)
            str += "(" + n + ")";
        
        return str;
    }
}

