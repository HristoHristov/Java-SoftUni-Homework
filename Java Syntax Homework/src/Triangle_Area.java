import java.util.Scanner;

public class Triangle_Area {
	public static void main(String[] arg) {
		Scanner in=new Scanner(System.in);
		int Ax=in.nextInt();
		int Ay=in.nextInt();
		int[] a=new int [] {Ax,Ay};
		int Bx=in.nextInt();
		int By=in.nextInt();
		int[] b=new int[]{Bx,By};
		int Cx=in.nextInt();
		int Cy=in.nextInt();
		int[] c=new int[] {Cx,Cy};
		int area=a[0]*(b[1]-c[1])+b[0]*(c[1]-a[1])+c[0]*(a[1]-b[1]);
		area=area/2;
		System.out.println(Math.abs(area));
	}
	
}
