import java.util.Scanner;

public class Problem17
{
   public static void main(String[] args)
   {
      int one = 25;
      
      int two = 17;
      
      howManyEnteredBefore(one, two);  
      
   }
   public static void howManyEnteredBefore(int one, int two)
   {
      Scanner input = new Scanner(System.in);
      
      int cnt = 0; 
      
      int count = 0; 
      
      int x = 0; 
      
      while(cnt < 2)
      {
         System.out.print("Enter an Int: "); 
         x = input.nextInt();
         
         if( x == one || x == two)
         {
            cnt++; 
         }
         count++; 
      }
      System.out.println("you had to enter "+count+"ints");
      System.out.print("before typing "+one+"and "+two+".");

   }
}