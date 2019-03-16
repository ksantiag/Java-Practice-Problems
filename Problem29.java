import java.util.Scanner; 

public class Problem29
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in); 
      
      int a = 0; 
      int b = 0; 
      int c = 0;
      int product = 0;  
      
      System.out.print("Enter a: "); 
      a = input.nextInt();
      
      System.out.print("Enter a: "); 
      b = input.nextInt(); 
      
      System.out.print("Enter a: "); 
      c = input.nextInt();
      
      product = a * b * c; 
      
      if(product == 0 || product < 1)
      {
         System.out.print("These CANNOT make a triangle.");
      }
      else
      {
         System.out.print("These CAN make a triangle."); 
      }    
   }
   
}  