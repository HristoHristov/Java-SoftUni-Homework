import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Count_Specified_Word {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String firstStr = in.nextLine();
		String secondStr = in.nextLine();
		int count=0;
		Pattern wordPattern = Pattern.compile("\\w+");
						Matcher matcher = wordPattern.matcher(firstStr);
				ArrayList<String>countWord=new ArrayList<>();
				while(matcher.find()){
					countWord.add(matcher.group());
				}
			for (int i = 0; i < countWord.size(); i++) {
				
					if(secondStr.toLowerCase().equals(countWord.get(i).toLowerCase())){
						count++;
					}					
			}
			System.out.println(count);
			
	}

}
