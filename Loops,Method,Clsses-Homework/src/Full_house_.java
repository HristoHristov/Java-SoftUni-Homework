import java.util.Scanner;


public class Full_house_ {
	public static void main(String[] args) {
		String[] suits= new String[]{"\u2663","\u2666", "\u2764","\u2660",};
		String[] cards=new String[]{"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		int count=0;
		for(int i=0; i<cards.length; i++) {
			for(int j=0; j<2;j++) {
				for(int k=j+1; k<3; k++) {
					for(int l=k+1; l<4;l++) {
						for(int m=0; m<cards.length;m++) {
							for(int n=0; n<suits.length-1;n++) {
								for(int o=n+1; o<suits.length; o++) {
									
									if(i!=m){
										count++;
										System.out.println(count+": (" +cards[i]+""+suits[j]+" "+cards[i]+""+suits[k]+" "+cards[i]+""+suits[l]+" "+
														   cards[m]+""+suits[n]+" "+cards[m]+""+suits[o]+")");						
									}
								}
							}
						}
					}
				}
			}
		}
		
	}
	
}
