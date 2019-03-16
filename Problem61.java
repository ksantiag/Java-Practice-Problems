import java.util.Scanner; 

public class Problem61
{
   public static void main(String[] args)
   {
      int m = 3, n = 5; 
      
      int result[][] = createArray(m, n);
      
      for(int i = 0; i < result.length; i++)
      {
         for(int j = 0; j < result[0].length; j++)
         {
            System.out.print(result[i][j]+" ");
         }
         System.out.println();
      }  
   }
   public static int[][] createArray(int m, int n)
   {
      Scanner input = new Scanner(System.in);
      
      int[][] result = new int[m][n];
      
      for(int i = 0; i < result.length; i++)
      {
         System.out.print("Enter "+n+" integers for row "+i+": ");
         for(int j = 0; j < result[0].length; j++)
         {
            result[i][j] = input.nextInt();
         } 
      }
      return result;  
      
   }
}