import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Problem_10 {
	
	public static void main(String[] args) {
		try{
		PrintWriter save=new PrintWriter(new FileWriter("Problem_10_File/Output.txt"));
		save.println("Result");
		save.println(result());
		System.out.println(result());
		
		save.close();
		}
		catch (Exception e){
            System.out.println(e.toString());
        }
	}
	public static BigDecimal result()	{
		 List<String> products=new ArrayList<String>();
		 List<String> orders=new ArrayList<String>();
		try{
           
            BufferedReader fileReader = new BufferedReader(new FileReader("Problem_10_File/Products.txt"));

            String str;	    
          
           
            while ((str=fileReader.readLine())!=null){
              
               products.add(str);
               
            }
            fileReader.close();
		}
		catch (Exception e){
            System.out.println(e.toString());
        }
		
           
					try{
				           
			            BufferedReader fileReader = new BufferedReader(new FileReader("Problem_10_File/Orders.txt"));

			            String str;	    
			          
			           
			            while ((str=fileReader.readLine())!=null){
			              
			               orders.add(str);
			             
			            }
			            fileReader.close();
					}
					catch (Exception e){
			            
			        }
					BigDecimal result=new BigDecimal(0);
					
					 int number=0;
						String[] product =new String[products.size()*2];
						for (String string : products) {					
							String[] stri=string.split(" ");
							product[number++]=stri[0];
							product[number++]=stri[1];
							
						}
					int number1=0;
					String[] order =new String[orders.size()*2];
					for (String string1 : orders) {					
						String[] split=string1.split(" ");
						order[number1++]=split[1];
						order[number1++]=split[0];
						
					}
					
					for (int i = 0; i < product.length; i+=2) {
						for (int j = 0; j < order.length; j+=2) {
							
							if(product[i].equals(order[j])) {
												
							BigDecimal prod=new BigDecimal(product[i+1]).multiply(new BigDecimal(order[j+1]));
							result=result.add(prod);
							
							
							}
						}
						
						
					}
					return result;
		
				}
	}
				
	



