import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Points_inside_the_House {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		float x=in.nextFloat();
		float y=in.nextFloat();
		if (y>8.5 && y<=13.5) {
			if((y>8.5 && y<=13.5) && (x>=12.5 && x<=17.5) || (y>=8.5 && y<=13.5) && (x>=20 && x<=22.5)) {
				System.out.println("Inside");
			}
			else {
				System.out.println("Outside");
			}
			
		}
		else {
			
			float a=12.50f;
			float b=22.50f;
			float c=17.50f;
			float multiplic_b_x=b*x;
			float multiplic_a_x=a*x;
			float subtr_b_a=multiplic_b_x-multiplic_a_x;
			//b.x - a.x)*(c.y - a.y) - (b.y - a.y)*(c.x - a.x
			float multiplic_c_y=(c*y);
			float multiplic_a_y=(a*y);
			float subtr_c_a=multiplic_c_y-multiplic_a_y;
			
			float multiplic_b_y=(b*y);
			float multiplic_a_y2=(a*y);
			float subtr_b_a2=multiplic_b_y-multiplic_a_y2;
			
			float multiplic_c_x=(c*x);
			float multiplic_a_x2=(a*x);
			float subtr_c_a2=multiplic_c_x-multiplic_a_x2;
			float A=subtr_b_a * subtr_c_a;
			float B=subtr_b_a2 *subtr_c_a2;
			float result= A - B;
			System.out.println(result);
			if(result==0) {
				System.out.println("Inside");
			}
			else {
				System.out.println("Outside");
				
			}
		}
	}
}

