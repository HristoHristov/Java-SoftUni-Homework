import java.math.BigInteger;
import java.util.Scanner;

public class Formatting_Numbers {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		String hex=Integer.toHexString(a);
		hex=hex.toUpperCase();
		float b=in.nextFloat();
		float c=in.nextFloat();
		String bin=String.format("%016d", new BigInteger(Integer.toBinaryString(a)));		
		System.out.printf("|%-10s |%-10s|%10.2f|%10.3f|",hex,bin,b,c);

	}

}
