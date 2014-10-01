import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Count_Substring_Occurrences {

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
				
				String match=countWord.get(i);
				for(int j=secondStr.length(); j<=match.length();j+=secondStr.length()) {
					if(match.substring(j-secondStr.length() ,j-secondStr.length()+secondStr.length()).toUpperCase().equals(secondStr.toUpperCase())) {
						
						count++;
					}
				}
				String reverse= new StringBuffer(match).reverse().toString();
				for(int k=0; k<reverse.length()-secondStr.length();k+=secondStr.length()) {
					if(reverse.substring(k ,secondStr.length()+k).toUpperCase().equals(secondStr.toUpperCase())) {
					count++;
					}
				}
					
			}
			System.out.println(count);
				}
				
			
					
	}


