import java.awt.geom.CubicCurve2D.Double;
import java.util.Scanner;

public class The_Smallest_of_3_Numbers {
	public static void main(String[] args) {
		Scanner include=new Scanner(System.in);
		double a=include.nextDouble();
		double b=include.nextDouble();
		double c=include.nextDouble();
		double theSmallest=a;
		if(theSmallest>b) {
			theSmallest = b;
		}
		if(theSmallest>c) {
		
			theSmallest = c; 
		}
		System.out.print(theSmallest);
	}
}
