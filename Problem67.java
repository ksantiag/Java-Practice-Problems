//correct in g == n, try higher if g < n, if g > n trylower
import java.util.Scanner;

public class Problem67
{
   public static void main(String[] args)
   {
      int n =976; 
      
      playGuessingGame(n);
   }
   public static void playGuessingGame(int n)
   {
      Scanner input = new Scanner(System.in);
       
      int g = 0, count = 0;
      
      int[] check = new int[1001];
      
      do
      {
         System.out.print("Guess a number: "); 
         g = input.nextInt(); 
         
         if(check[g] == 0)   
            {
               check[g] = g; 
            }
         else
            System.out.print("Already entered CANO!!!!");       
         
         
         
         count++;
         
         if(g == n)
         {
            System.out.println("CORRECT. ");   
         }
         else if(g > n)
         {
            System.out.println("TRY LOWER. ");
         }
         else
         {
            System.out.println("TRY HIGHER. ");
         }
         
       }while(g != n);
       
       System.out.print("It took you "+count+" guesses! Culisipin cagadin");
      
   } 
}