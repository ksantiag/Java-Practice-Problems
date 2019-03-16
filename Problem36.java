import java.util.Scanner; 

public class Problem36
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in); 
        
        int x = 0; 
        int cnt = 0;
        int cnt2 = 0;   
        int sum = 0;
        
        while (cnt < 1)
        {
            sum += x; 
            
            System.out.print("Enter an Int: ");
            x = input.nextInt();
            cnt2++; 
            
            if(x == sum)
            {
                cnt++; 
            }
        }
        
        System.out.print("you entered "+cnt2+ " ints"); 
    }
}