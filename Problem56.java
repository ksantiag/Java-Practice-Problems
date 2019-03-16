//get user input
//divid to get a mod to get d
//loop until a and d are the same
//assume input is valid
import java.util.Scanner;

public class Problem56{
   public static void main (String[] args){
      Scanner input = new Scanner(System.in); 
      
      int a, d, q, r; 
      
      do{
      
      
      System.out.print("Enter pos. integer a: ");
      a = input.nextInt(); 
      
      System.out.print("Enter pos. integer d: ");
      d = input.nextInt();
      
      q = a / d;
      
      r = a % d;
      
      System.out.println("The quotient is "+q+" an the remainder is "+r);
      }while(q != r);
       
      System.out.print("BYE!!!!"); 
      
      
   }
}