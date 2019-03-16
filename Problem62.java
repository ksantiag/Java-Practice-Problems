import java.util.Scanner; 

public class Problem62
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int n, k; 
      
      do
      {
         System.out.print("Enter n and k: ");
         n = input.nextInt(); 
         k = input.nextInt(); 
         
         if(n >= 0 && k >= 0)
         {
            for(int i = 0; i < k; i++)
            {
               System.out.print(n+" ");
            }
            System.out.println(); 
         }
         
        }while(n >= 0 && k >= 0); 
        
        System.out.print("BYE!");  
   }
}