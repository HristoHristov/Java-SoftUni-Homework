import java.util.Random;
import java.util.Scanner;


public class Full_House {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		String[] cards=new String[] {"2","3","4","5","6","7","8","9","10","A","K","Q","J"};
		String[] suit=new String[] {"♠", "♥", "♦","♠"};
		String[] card_suit=new String[52];
		int count=0;
		int form=0;
		int[] ra=new int[5*n];
		int r=0;
		boolean razl=true;
		Random rand=new Random();
		for(int i=0; i<cards.length;i++) {
			for (int j = 0; j < suit.length; j++) {
				card_suit[count]=cards[i]+""+suit[j];
				count++;
			}
			
		}
		while(r<n*5) {
			int m=rand.nextInt(52);
			for(int i=0;i<ra.length ;i++) {
				if(ra[i]==m) {
					razl=false;
				}
			}
			if(razl==true) {
				ra[r]=m;
				r++;
			}
			razl=true;
		}
		for (int z = 0; z < ra.length; z++) {
			form++;
			System.out.format(card_suit[ra[z]]+" ");
			if(form % 5==0) {
				System.out.println(" ");
			}
		}
	}

}
