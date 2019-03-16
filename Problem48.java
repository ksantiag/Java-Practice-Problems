import java.util.Scanner;

public class Problem48
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int x = 0, count = 0, temp = 0, sum = 0; 
      
      System.out.print("Enter an int: ");
      x = input.nextInt();
      sum += x;
      temp = x; 
      
      while(count != 2)
      {
         System.out.print("Enter an int: ");
         x = input.nextInt();
         sum += x; 
         
         if(x-temp == 1)
         {
            count++;
         }
         /*make sure you reset the count because it will exit one early 
         if your accension starts over*/
         else
            count = 0;   
            
         temp = x;    
      } 
      
      System.out.print(sum);
   }
}