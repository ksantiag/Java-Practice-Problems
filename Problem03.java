import java.util.Scanner; 

public class Problem3
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in); 
        
        int x = 0; 
        int cnt = 0;
        int last = 0;
        
        while (cnt < 3)
        {
             
            
            System.out.print("Enter an Int: ");
            x = input.nextInt();
            
            last = x;
            
            if(x == last)
            {
                cnt++; 
            }
        }
        
        System.out.print("samr entered 3 in a row"); 
    }
}