//took four fixes 
//had trouble setting up the loop right to calculate (1 * 2 * 3 *....*n)
import java.util.Scanner; 

public class Problem34
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in); 
        
        int n = 0;
        int product = 1;  
        
        System.out.print("Enter an Int: ");
        n = input.nextInt(); 
        
       if( n < 1)
       {
         while(n < 1)
            {
                System.out.print("Please enter a int greater 0: ");
                n = input.nextInt();    
            }
       }
       for(int i = 1; i <= n; i++)
       {
           product *= i; 
       }
       System.out.print("product is: " + product);      
    }   
}