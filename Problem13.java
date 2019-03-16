import java.util.Scanner;

public class Problem13 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);   
        int [] a = new int[10000]; 
        int x = 0;
        int cnt = 0;  
   
   do
   {
        System.out.print("Enter an int: ");
        x = input.nextInt(); 
        a[x]++;  
        cnt++; 
      
   }while(a[x] <2); 
   
   System.out.print("you entered " + (cnt-1) +" values");
 }
}
