import java.util.Scanner; 

public class Problem28
{
   public static void main(String[] args)
   {
      int x = 0; 
      
      Scanner input = new Scanner(System.in); 
      
      System.out.print("Enter an Int: ");
      x = input.nextInt(); 
      
      int result = howManySteps(x); 
      
      System.out.print(result); 
      
   }
   public static int howManySteps(int x) 
   {
      
      int step = 0; 
  
      while(x != 1)
      {     
            
         if(x % 2 == 0)
           {
               x = x / 2;
               step++;
           }
         if(x != 1 && x % 2 != 0)
           {
               x = x * 3 + 1;
               step++;   
           }
      } 
    
      return step; 
   }
}