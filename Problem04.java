//imports scanner
import java.util.Scanner; 
//check
public class Problem04{
   public static void main(String[] args){
      //declares Scanner
      Scanner input = new Scanner(System.in); 
      //program asks for doubles check
      double a, b, c;
      //input a system check
      System.out.print("Enter Value: ");
      a = input.nextDouble();
      //input b system check
      System.out.print("Enter Value: ");
      b = input.nextDouble(); 
      //c checked error found and corrected
      System.out.print("Enter Value: ");
      c = input.nextDouble(); 
      
      System.out.println(); 
      
      if(a > b && b > c)
         System.out.println("Decreasing!");  
      else if(a < b && b < c)
         System.out.println("Increasing!"); 
      else
         System.out.println("Neither!");      
        
   }
}