import java.util.Scanner;
public class Symmetric_Numbers_in_Range {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int start=in.nextInt();
		int end=in.nextInt();
		for (int i = start; i <=end; i++) {
			String number=Integer.toString(i);
			String rever=new StringBuffer(number).reverse().toString();
			if (number.equals(rever)) {
				System.out.print(number + " ");
			}
		}
		
	
		}
	}

