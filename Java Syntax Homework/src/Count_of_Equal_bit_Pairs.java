import java.util.Scanner;
public class Count_of_Equal_bit_Pairs {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String nlenght = Integer.toBinaryString(n);
		
		int bitequal = 0;
		for (int i = 0; i < nlenght.length(); i++) {
			int nright = n >> i;
			nright = nright & 1;
			int nright2 = n >> i + 1;
			nright2 = nright2 & 1;
			if (nright == nright2) {
				bitequal += 1;				
				
			}
			
		}
		
		System.out.println("Bit Equal: " + bitequal);
	}
}
