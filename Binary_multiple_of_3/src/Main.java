import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("(1(01*0)*1|0)*");
		System.out.println(p.matcher("110").matches());
	}

}
