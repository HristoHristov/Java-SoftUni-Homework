
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Sum_number_from_file
{
    public static void main (String[] args) 
    {
    	try {
            FileReader fr=new FileReader("file/number.txt");
            BufferedReader bfr=new BufferedReader(fr);
            String num;
            int number=0;
            while ((num=bfr.readLine())!=null) {
                   number+=Integer.parseInt(num);
            }
            System.out.println(number);
            bfr.close();
    		}catch (IOException e) {
           System.err.print("Error!");
          }
        }
    
}