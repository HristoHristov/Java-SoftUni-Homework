import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Longest_Increasing_Sequence {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		int max= Integer.MIN_VALUE;
		String[] str_number=str.split(" ");
		int a=0;
		int b=0;
		boolean isLess=true;
		int count=0;
		
		int[] number=new int[str_number.length];
		ArrayList<Integer> longest=new ArrayList<>();
		ArrayList<Integer> longest2=new ArrayList<>();
		for(int i=0;i<str_number.length;i++) {
		 number[i]=Integer.parseInt(str_number[i]);
		 
		 
		
		}
		for (int i = 0; i < number.length; i++) {			
			for (int j = i+1; j < number.length; j++) {
				if(number[i]<number[j]) {					
					if(isLess==false) {						
						longest2.add(number[i]);
						System.out.print(number[i]+" ");
						b++;						
					}
					else{
						System.out.print(number[i]+" ");
						longest2.add(number[i]);
						b++;
						
						isLess=false;
						
					}
				}
					
					
					
					
					
				else if(isLess==false) {
						
					b=0;
					System.out.print(number[i]+"\n");
					longest2.add(number[i]);
				}	
			
				else{	
					
				b=0;
				System.out.print(number[i]+"\n");			
						
				longest2.add(number[i]);		
						
					
					
			}
				i=j;
				if(i==number.length-1) {
					System.out.print(number[i]+" ");
					if(b!=0) {
						longest2.add(number[i]);
					}
					
					
					
				
			    }
				
				if(b==0 || i==number.length-1){
			if(longest2.size()>longest.size()){
				
					longest.removeAll(longest);
				
				for (Integer integer : longest2) {
					longest.add(integer);
					
				}
			}
			
				
					longest2.removeAll(longest2);
			
			
				}
			}
		
		}
		System.out.print("\nLongest: ");
		for (Integer integer : longest) {
			System.out.print(integer+" ");
		}
	}
}

		

	


