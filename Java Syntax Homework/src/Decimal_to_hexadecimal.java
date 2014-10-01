import java.util.Scanner;

public class Decimal_to_hexadecimal {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int decimal=in.nextInt();
		String hex=Integer.toHexString(decimal);
		String upper=hex.toUpperCase();
		System.out.println(upper);
	}

}
