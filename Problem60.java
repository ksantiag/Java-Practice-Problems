import java.util.Scanner;
public class Problem60
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int n = 0, t = 0, product = 1, sum = 0, count = 0; 
      
      System.out.print("Enter possitve integer n: "); 
      t = input.nextInt(); 
      System.out.print("Enter "+t+" integers: ");
      
      int[] result = new int[t];
      
      for(int i = 0; i < t; i++)
      {
         result[i] = input.nextInt();
         sum += result[i];
         product *= result[i];
      }   
       
       if(sum > product)  
       {
         System.out.print("SUM");
       }
       else if( sum < product)
       {
         System.out.print("Product");
       } 
       else
         System.out.print("TIE");
           
   }
}