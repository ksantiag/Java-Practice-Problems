import java.util.Scanner; 

public class Problem15
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int n, temp, quarter = 0, nickel = 0, penny = 0; 
      
      System.out.print("Enter an integer: ");
      n = input.nextInt(); 
      
      quarter = n / 25; 
      temp = n % 25; 
      
      nickel = temp / 5; 
      
      penny = temp % 5; 
      
      
      System.out.println();

      
      System.out.println("To make "+n+" cents, you need: ");
      
      System.out.println();
      
      System.out.println(quarter+" Quarters");
      System.out.println(nickel+" nickles");
      System.out.println(penny+" pennies");
      
        
   }
}