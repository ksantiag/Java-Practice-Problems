//user input needed
//must be possitive error check
//must enter at least 1 do while condition(x < 1)
//the output the product from 1 to n INCLUSIVE!!!!!
//DO NOT OUT PUT 0 ie setproduct varible to 1
import java.util.Scanner; 

public class Problem34B
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in); 
      
      int n = 0, product = 1; 
      
      do
      {
         System.out.print("Enter an int > 0: "); 
         n = input.nextInt();
          
      }while(n < 1); 
      
      for(int i = 1; i <= n; i++)
      {
         product *= i;
      }
      System.out.print(product); 
         
          
   }
}