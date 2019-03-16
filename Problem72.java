//get user input
//enter numbers until the are exactly 10
//doubles ivolved ints into doubles ok 
import java.util.Scanner;
public class Problem72
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int count = 0; 
      double sum = 0, x = 0;
      
      do
      {
         System.out.print("Enter a number: ");
         x = input.nextDouble();
         
         sum += x;
         
         count++;
         
      }while(sum != 10.0); 
      
      System.out.print(count);  
   }
}