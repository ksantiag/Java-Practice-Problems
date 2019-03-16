import java.util.Scanner; 

public class Problem39
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); 
        int x, y, z, sum; 
        
        System.out.print("Enter an Int: "); 
        x =input.nextInt(); 
        
        System.out.print("Enter another int: "); 
        y =input.nextInt(); 
        
        System.out.print("One more, please: "); 
        z =input.nextInt(); 
        
        sum = x+y+z; 
        
        if(sum % 5 == 0 && sum % 3 == 0)
        {
            sum = sum * 3; 
            
            System.out.print("Result: "+ sum);
        }
        else if(sum % 5 == 0 || sum % 3 == 0)
        {
            sum = sum * 2; 
            
            System.out.print("Result: "+ sum);
        }
        else
        {
            System.out.print("Result: "+ sum);   
        }
        
        
        
    }   
}
