import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.*;


public class List_of_Products {

	public static void main(String[] args) {
		try {
		FileReader fr=new FileReader("file/List_products.txt");
		BufferedReader bf=new BufferedReader(fr);
		String f;
		
		int m=0;
		List<String> listst = new ArrayList<String>();
		List<BigDecimal> listfl = new ArrayList<BigDecimal>();
		while((f=bf.readLine())!=null) {
			
			String[] stri=f.split(" ");
			listst.add(stri[0]+"-"+ stri[1]);
			listfl.add((new BigDecimal(stri[1])));
			m++;
		}
		Collections.sort(listfl);  
		String[] nistr=new String[m];
		List<String> res = new ArrayList<String>();
		int count=0;
		String[] b= new String[listfl.size()];
		for(String s : listst){
			String[] st=s.split("-");
		  nistr[count]= st[1] +" " +st[0];
			res.add(st[1]);
			count++;
			
			
		}	
		PrintWriter save=new PrintWriter(new FileWriter("file/Output.txt"));
		for(BigDecimal fl : listfl){
			String si=fl.toString()+ " ";
			String[] split=si.split(" ");
			String n=split[0];
			for (int i = 0; i <count; i++) {
				if(n.equals(res.get(i))) {
					
						
						
						save.println(nistr[i]);
						System.out.println(nistr[i]);
						
						
						
						
					
				}
			}
			
		
		
		}
		save.close();
		
		}
		catch(IOException e) {
			
		}

	}

}
