import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Combine_Lists_of_Letters {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String L1=in.nextLine();
		String L2=in.nextLine();
		boolean isEqual=false;
		ArrayList<Character> letter1=new ArrayList<>();
		ArrayList<Character> letter2=new ArrayList<>();
		ArrayList<Character> adding=new ArrayList<>();
		for (int i = 0; i < L1.length(); i+=2) {
			letter1.add(L1.charAt(i));			
		}		
		for (int l2 = 0; l2 < L2.length(); l2+=2) {
			letter2.add(L2.charAt(l2));
		}
		for (int i = 0; i < letter2.size(); i++) {
			for (int j = 0; j < letter1.size(); j++) {
				if(letter2.get(i).equals(letter1.get(j))) {
					isEqual=true;
				}
			}
			if(isEqual==false) {
				adding.add(letter2.get(i));
			}
			isEqual=false;
			
		}
		for (Character character : adding) {
			letter1.add(character);
		}
		for(Character ch : letter1) {
			System.out.print(ch + " ");
		}
		
	}

}
