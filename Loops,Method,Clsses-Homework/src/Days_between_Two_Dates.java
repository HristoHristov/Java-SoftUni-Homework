import java.util.Scanner;
 import org.joda.time.DateTime;
 import org.joda.time.Days;
 import org.joda.time.LocalDate;
 import org.joda.time.format.DateTimeFormat;
 import org.joda.time.format.DateTimeFormatter;

public class Days_between_Two_Dates {
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String date1=in.next();
		String date2=in.next();
		String[] str1=date1.split("-");
		String[] str2=date2.split("-");
		int date1_0=Integer.parseInt(str1[0]);
		int date1_1=Integer.parseInt(str1[1]);
		int date1_2=Integer.parseInt(str1[2]);
		int date2_0=Integer.parseInt(str2[0]);
		int date2_1=Integer.parseInt(str2[1]);
		int date2_2=Integer.parseInt(str2[2]);
		DateTime dt1 = new DateTime(date1_2,date1_1,date1_0,0,0,0,0);
		DateTime dt2 = new DateTime(date2_2,date2_1,date2_0,0,0,0,0);
		int days = Days.daysBetween(dt1, dt2).getDays();
		System.out.println(days);
		
		
		
		
	}
}
