import java.util.Scanner;


public class Sequences_of_EqualStrings {

	public static void main(String[] args) {
		int count=1;
			Scanner in=new Scanner(System.in);
			String string=in.nextLine();
			String[] str=string.split(" ");
			boolean input=true;
			
			for (int i = 0; i < str.length; i++) {
				for(int j=i+1; j<str.length;j++) {
					if(str[i].equals(str[j])) {
						count++;
						
						
					}
					
				}
				i+=count-1;
				if(count>1) {
					for (int equal = 1; equal <=count; equal++) {
						System.out.print(str[i]+" ");
						
					}
					count=1;
					
				}
				else {
					if(i==0){
						i+=count-1;
						System.out.print(str[i]+"\n");
					}
					else {
						i+=count-1;
						System.out.print("\n"+str[i]+"\n");
					}
				}
						
							
							
							
						
						
			}
	}
}
				
			



