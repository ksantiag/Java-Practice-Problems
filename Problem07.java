import java.util.Scanner;

public class Problem07
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int n, powerOf, result = 1;
      
       System.out.print("Enter a: ");  
       n = input.nextInt();
       
       System.out.print("Enter b: ");
       powerOf = input.nextInt();
       
       for(int i = 0; i < powerOf; i++)
       {
         result = result * n;  
       } 
       
        System.out.print(n+" to the power of "+powerOf+" is "+result);
   }
}