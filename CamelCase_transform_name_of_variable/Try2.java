
public class Try2 {

	public static void main(String[] args) {
		String s = "the_Stealth_Warrior";
		StringBuffer tryStr = new StringBuffer(s);
	    int x;
	    String replaceStr = new String();
			
		for(int i=0 ; i < s.length() ; i++)
		{
	      if(s.contains("_"))
	      {
	        if( tryStr.indexOf("_") == -1)
	        {
	          break;
	        }
	        else
	        {
	          x = tryStr.indexOf("_");
	          tryStr.deleteCharAt(x);
	          replaceStr = tryStr.substring(x, x+1).toUpperCase();
	          tryStr.replace(x, x+1 , replaceStr);
	        }
	      }
	      else if(s.contains("-"))
	      {
	          if( tryStr.indexOf("-") == -1)
	          {
	            break;
	          }
	          else
	          {
	            x = tryStr.indexOf("-");
	            tryStr.deleteCharAt(x);
	            replaceStr = tryStr.substring(x, x+1).toUpperCase();
	            tryStr.replace(x, x+1 , replaceStr);
	          }
	      }
		}
		System.out.println(tryStr.toString());
	}
}

