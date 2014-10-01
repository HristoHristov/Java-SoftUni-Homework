import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Most_Frequent_Word {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String text=in.nextLine();
		Pattern textPattern=Pattern.compile("[a-zA-Z]+");
		Matcher matcher=textPattern.matcher(text);
		ArrayList<String> frequent=new ArrayList<>();
		ArrayList<String> frequentWord=new ArrayList<>();
		int count=1;
		boolean mostFre=false;
		boolean isequals=false;
		ArrayList<String> sort=new ArrayList<>();
		while(matcher.find()) {
			frequent.add(matcher.group());
		}
		for (int i = 0; i < frequent.size(); i++) {
			for (int j = i+1; j < frequent.size(); j++) {
				if(frequent.get(i).toUpperCase().equals(frequent.get(j).toUpperCase())) {
					count++;
				}
			}
			if(count>1) {
				for(int k=0; k<frequentWord.size(); k++) {
					String[] str=frequentWord.get(k).split(" ");
					if(str[1].toUpperCase().equals(frequent.get(i).toUpperCase())) {
						isequals=true;
					}
				}
				if(isequals==false){
					frequentWord.add(Integer.toString(count)+" "+frequent.get(i));
					sort.add(frequent.get(i).toLowerCase() + " " +Integer.toString(count));
				}
			}
			isequals=false;
			count=1;
		}
		Collections.sort(frequentWord);
		Collections.sort(sort);
		
		String[] split=frequentWord.get(frequentWord.size()-1).split(" ");
		for(int l=1;l<sort.size();l++) {
			
			String[] split1=frequentWord.get(frequentWord.size()-2).split(" ");
			if(split[0].equals(split1[0])){
			String[] str=sort.get(0).split(" ");
			String[] str1=sort.get(l).split(" ");
			if(str[1].equals(str1[1])) {
				if (l==1) {
				System.out.println(str[1]+ " -> "+str[0]+ " times");
				System.out.println(str1[1]+ " -> "+str1[0]+ " times");
				mostFre=true;
				}
				else {
					System.out.println(str1[1]+ " -> "+str1[0]+ " times");
					mostFre=true;
				}
				
				
				}
			}
			else {
				break;
			}
		}
		if (mostFre==false) {
			System.out.println(split[1]+" -> "+split[0]+ " times");
		}
		
	}

}
