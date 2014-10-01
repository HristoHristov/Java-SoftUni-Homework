package Problem_6;

import java.util.Scanner;

public class Sum_Two_Numbers {
	public static void main(String[] args) {
		Scanner include=new Scanner(System.in);
		System.out.print("a= ");		
		int a=include.nextInt();
		System.out.print("b= ");
		int b=include.nextInt();
		int c=a+b;
		System.out.println("result= "+c);
	}
}
