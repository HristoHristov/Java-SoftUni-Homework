import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Cards_Frequencies {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String cards=input.nextLine();
		Pattern pattern=Pattern.compile("[\\d+A-Z]+");
		ArrayList<String> card=new ArrayList<>();
		ArrayList<String> countCard=new ArrayList<>();
		int count=1;
		float frequencies=0f;
		boolean isEquals=false;
		Matcher matcher=pattern.matcher(cards);
		while(matcher.find()) {
			card.add(matcher.group());
			
		}
		for(int i=0; i<card.size();i++) {
			for(int j=i+1; j<card.size();j++) {
				if(card.get(i).equals(card.get(j))) {
					count++;
				}				
			}
			for(int k=0;k<countCard.size();k++) {
				String[] split=countCard.get(k).split(" ");
				if(split[0].equals(card.get(i))) {
					isEquals=true;
				}
			}
			if(isEquals==false) {
				frequencies=((float)count/card.size())* 100f;
				countCard.add(card.get(i)+ " "+frequencies);
			}
			count=1;
			
		}
		for (String string : countCard) {
			String[]str=string.split(" ");
			System.out.format("%s -> %.2f", str[0],Float.parseFloat(str[1]));
			System.out.println("%");
		}

	}

}
