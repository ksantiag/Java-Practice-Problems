//method backAgain(int n) 
//takes int returns array
//2 loops one increment to n i <= n other starts at n -1 and i >=1
public class Problem50
{
   public static void main(String[]args)
   {
      int n = 4;
      
      int[] result = backAgain(n); 
      
      for(int i = 0; i < result.length; i++)
         System.out.print(result[i]+" ");
   }
   public static int[] backAgain(int n) 
   {
      int[] result = new int[n * 2 -1];
      
      int j = 0; 
      
      for(int i = 1; i <= n; i++)
      {
         result[j] = i;
         j++;
      }
      for(int i = n-1; i >=1; i--)
      {
         result[j] = i;
         j++;
      }
      return result; 
   }
}