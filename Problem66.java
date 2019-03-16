import java.util.Scanner; 

public class Problem66
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int sum = 0, min = 0, max = 0, n;
      
      System.out.print("Enter a positive int: ");
      n = input.nextInt();
      
      if(n > 0)
         sum+=n;
      
      min = n; 
      
      do
      {
         System.out.print("Enter a positive int: ");
         n = input.nextInt();
      
         if(n > 0)
         sum+=n;
         
         if(n > max)
            max = n;
             
         if(n < min && n > 0)
            min = n; 
      }while(n > 0); 
      
      sum = sum -max -min;
      
      System.out.print("The sum of these, not counting the lowest and highest, is "+sum);    
            
         
            
  }     
   
 
}