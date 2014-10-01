import java.util.Arrays;
import java.util.Scanner;


public class Largest_Sequence_of_Equal_Strings {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String str= in.nextLine();
		int max= Integer.MIN_VALUE;
		boolean isZero=true;
		int count=0;
		String[] string=str.split(" ");
		String[] str_equals=new String[string.length];
		int[] equals=new int[string.length];
		for (int i = 0; i < string.length; i++) {
			for (int j = i+1; j < string.length; j++) {
				if(string[i].equals(string[j])) {
					count++;
				}
				
				
			}			
			if(count>0) {
				equals[i]=count;
				if(count>max) {
					max=count;
				}
				
				
				i+=count;
				
			}
			
			
			else {
				if(count>max) {
					max=count;
				}
				equals[i]=count;
				str_equals[i]=string[i];
				//System.out.println("\n"+string[i]+"\n");
			}
			count=0;
			
		}
		int index=0;
		for (int i = 0; i < equals.length-2; i++) {
			
					
			if(equals[i]==equals[i+2]) {
				
			}
			else if(equals[i]==equals[i+1]) {
				
			}
			else {
			if(equals[i]==max) {
				isZero=false;
				index=i;
				
			}
			}
			
		}
		if(isZero) {
			for (int i = 0; i <=max; i++) {
				System.out.print(string[0]);
			}
			
		}
		else {
			for (int j = 0; j <= max; j++) {
				System.out.print(string[index]+ " ");
			}
		}
		
		
	
		
	}

}
