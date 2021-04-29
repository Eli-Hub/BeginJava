
package leapyear;
import java.util.Scanner;




public class Leapyear {

   
    public static void main(String[] args) {
        Scanner accept = new Scanner (System.in);
        
       int year=0;
       System.out.println("Enter Year: ");
       
       year = accept.nextInt();
       if (year%4 == 0 || year%100 == 0 && year%400 == 0){
           
           System.out.println(year + " is a leap year.");
       }
       
       else
       {
           System.out.println(year + " is not a leap year.");
       }
    }
    
}
