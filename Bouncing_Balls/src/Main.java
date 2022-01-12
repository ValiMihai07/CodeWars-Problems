
public class Main {

	public static void main(String[] args) {
		float h =30;
		float bounce =0.66f;
		float window = 1.5f;
		int timesBounce =1;
		
		if( h>0 && window<h && bounce>0 && bounce<1 )
		{
			h=h*bounce;
			while(h>window)
			{
				h=h*bounce;
				timesBounce+=2;
			}
			System.out.println(timesBounce);
		}
		else
		{
			System.out.println("-1");
		}

	}

}
