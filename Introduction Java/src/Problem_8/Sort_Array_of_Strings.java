//Write a program that enters from the console number n and n strings, then sorts them alphabetically and prints them.
//Note: you might need to learn how to use loops and arrays in Java (search in Internet). 
package Problem_8;
import java.util.Scanner;
import java.util.Arrays;
public class Sort_Array_of_Strings {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr= new String[n];
        for(int i = 0; i < arr.length; i++) {
        arr[i]=in.next();
        }
        Arrays.sort(arr);
        for (int j=0; j<arr.length;j++) {
            System.out.println(arr[j]);
        }
    }
 }
