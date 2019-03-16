//get user input
//takes nubers until ten is entered
//get max and min set them to 10
//PERFECT!!!!!!
import java.util.Scanner; 

public class Problem31
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in); 
      
      int x = 0, min = 10, max = 10;
      
      do
      {
         System.out.print("Enter an int: "); 
         x = input.nextInt(); 
         
         if(x > max)
            max = x; 
         
         if(x < min)
            min = x; 
            
      }while(x !=10); 
      
      System.out.println(); 
      System.out.println("Min: "+min);
      System.out.println("Max: "+max);
              
   }
}