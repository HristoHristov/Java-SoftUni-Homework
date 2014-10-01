import java.util.Scanner;

public class Angle_Unit_Converter {
		

			public static void main(String[] args) {
				Scanner in=new Scanner(System.in);
				int n=in.nextInt();		
				
				String[] string=adiansDegreesresult(in, n);
				
				for (int i = 0; i < string.length; i+=2) {
				
					float z=Float.parseFloat(string[i]);
					//System.out.println(z);
					
					System.out.format("%.6f %s",z,string[i+1]);
					System.out.println("\n");
				}
				
				
				
			}
				public static  String[] adiansDegreesresult(Scanner in,int n) {
					
					double[] result= new double[n];
					String[] strings= new String[n+n];
					int j=0;
				for (int i = 0; i < n; i++) {
					
					double number= in.nextDouble();
					
					
					String str=in.next("\\w+");;
					if(str.equals("rad")) {		
						result[i]= Math.toDegrees(number);
						strings[j++]=Double.toString(result[i]);
						strings[j++]=str;
						
					}
					else {
						result[i]= Math.toRadians(number);
						
						strings[j++]=Double.toString(result[i]);
						strings[j++]=str;
					}
				
				}
				return  strings;
					
					
					
				  
				}
				
				
				}

			


