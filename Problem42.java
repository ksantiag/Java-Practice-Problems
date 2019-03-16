import java.util.Scanner; 

public class Problem42
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in); 
      
      int a = 0; 
      int b = 0; 
      int c = 0;
      int sum = 0;  
      
      System.out.print("Enter a: "); 
      a = input.nextInt(); 
      
      System.out.print("Enter b: "); 
      b = input.nextInt();
      
      System.out.print("Enter c: "); 
      c = input.nextInt();  
      
      sum = a + b + c; 
      
      if(sum % 8 == 0 && sum % 10 != 4 && sum % 10 != 8)
      {
         System.out.print("red"); 
      }
      else if(sum % 8 == 0 && sum % 10 == 4 || sum % 10 == 8)
      {
         System.out.print("blue");    
      }
      else
      {
         System.out.print("green");
      } 
   }
}