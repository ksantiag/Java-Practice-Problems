import java.util.Scanner; 

public class Problem53
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); 
        
        int x = 0; 
     
        System.out.print("Please Enter an int: ");
         
        x = input.nextInt(); 
        
        System.out.println(); 
        
        int result = highestPow(x); 
        
        System.out.print(result);          
    }
    public static int highestPow(int x)
    {
        int pow = 2; 
        int y = 0; 
       
       
        while(x % pow == 0)
        {
            if( x % pow == 0)
            {
                pow = (int)Math.pow(2, y); 
                y++; 
            } 
        }
        pow = pow /2; 
        
        
        return pow;
      }    
    
}