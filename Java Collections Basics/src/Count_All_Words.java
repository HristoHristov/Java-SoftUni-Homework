import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Count_All_Words {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str = in.nextLine();
		Pattern wordPattern = Pattern.compile("\\w+");
						Matcher matcher = wordPattern.matcher(str);
				ArrayList<String>countWord=new ArrayList<>();
				while(matcher.find()){
					countWord.add(matcher.group());
				}
				System.out.println(countWord.size());

	}

}
