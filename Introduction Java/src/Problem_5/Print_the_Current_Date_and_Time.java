package Problem_5;
import java.util.Date;
import java.text.SimpleDateFormat;       
public class Print_the_Current_Date_and_Time {
    public static void main(String[] arg) {
        Date date=new Date();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
        System.out.println(format.format(date));
    }
    
}
