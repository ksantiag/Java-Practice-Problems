
import java.util.Scanner; 

public class Problem040{
   public static void main(String[] args){
      
      Scanner input = new Scanner(System.in); 
     
      double a, b, c;
      
      System.out.print("Enter Value: ");
      a = input.nextDouble();
      
      System.out.print("Enter Value: ");
      b = input.nextDouble(); 
      
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