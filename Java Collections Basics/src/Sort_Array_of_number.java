import java.util.Arrays;
import java.util.Scanner;


public class Sort_Array_of_number {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n= in.nextInt();
		int[] number=new int[n];
		for (int i = 0; i < n; i++) {
			number[i]=in.nextInt();
		}
		Arrays.sort(number);
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i]+" ");
		}
	}

}
