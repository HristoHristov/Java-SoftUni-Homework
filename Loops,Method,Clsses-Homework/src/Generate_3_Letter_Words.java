import java.util.Scanner;

public class Generate_3_Letter_Words {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		String str=in.nextLine();
		int count=0;
		int strlength=str.length();
		for(int i=0; i<strlength;i++) {
			for (int j = 0; j < strlength; j++) {
				for (int k = 0; k < strlength; k++) {
					System.out.print(str.charAt(i)+""+ str.charAt(j)+""+str.charAt(k)+ " ");
				}
			}
		}
		
	}
}
