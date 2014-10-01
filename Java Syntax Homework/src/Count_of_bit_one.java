
import java.util.Scanner;

public class Count_of_bit_one {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int count1=0;		
		String bin=Integer.toBinaryString(n);
		for (int i = 0; i <= bin.length(); i++) {
			int one=(1<<i);			
			one=n & one;			
			if(one>0) {
				count1+=1;
			}
		}
		System.out.println(count1);

	}

}
