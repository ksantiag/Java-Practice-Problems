//needs to be shorter

import java.util.Scanner; 

public class Problem12
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); 
      
        int a = 0; 
        int b = 0; 
        int c = 0;
        int max = 0; 
        int cnt = 1;  
      
        System.out.print("Enter a: "); 
        a = input.nextInt(); 
            max = a;  
      
        System.out.print("Enter b: "); 
        b = input.nextInt(); 
            if(b > a)
            {
                max = b; 
            }
            if(b==a && b > max)
            {
                cnt++; 
            }
      
        System.out.print("Enter c: "); 
        c = input.nextInt(); 
            if(c > b)
            {
                max = c; 
            }
            if(b==c && c > max)
            {
                cnt++; 
            }
            
            if(a == b && a == c)
            {
                cnt = 3; 
            }
            
        System.out.println("the largest interger was: "+max); 
           if( cnt == 1)
            {
                System.out.print("was Entered once"); 
            }
            else if( cnt == 2)
            {
                System.out.print("was Entered twice"); 
            } 
            else
            {
                System.out.print("was Entered three times"); 
            }          
    }
}