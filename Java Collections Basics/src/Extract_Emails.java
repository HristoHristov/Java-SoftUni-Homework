	import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Extract_Emails {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String string=in.nextLine();
		ArrayList<String> email=new ArrayList<>();
		Pattern emailPattern = Pattern.compile(

				"[a-z.-]+@[a-z-.]+[a-z]+");
		Matcher matcher = emailPattern.matcher(string);

		while (matcher.find()) {
			email.add(matcher.group());
		}
		for (String string2 : email) {
			System.out.println(string2);
		}
	}

}
