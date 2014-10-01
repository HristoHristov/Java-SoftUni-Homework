import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Extract_All_Unique_Words {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String string=in.nextLine(); 
		boolean isUnique=true;
		ArrayList<String> word=new ArrayList<>();
		Pattern WordPattern = Pattern.compile("[a-zA-Z]+");
		Matcher matcher = WordPattern.matcher(string);
		while (matcher.find()) {
			String str=matcher.group();
			for (int i = 0; i < word.size(); i++) {			
				if(word.get(i).equals(str)) {
					isUnique=false;
				}
			}			
			if(isUnique) {
				word.add(str);
			}
			isUnique=true;
		}		
		Collections.sort(word, String.CASE_INSENSITIVE_ORDER);
		for (String string2 : word) {
			System.out.print(string2+" ");
		}
		

	}

}
