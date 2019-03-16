//glaciered(int k, int m); 
//run a for loop k % i == 0
//Retuned i instead of result;
public class Problem32
{
   public static void main(String[] args)
   {
      int k = 15, m = 32; 
      
      int result = glaciered(k, m); 
      
      System.out.print(result); 
   }
   public static int glaciered(int k, int m)
   {
      int max = Math.max(k, m); 
      int result = 0; 
      
      for(int i = 1; i <= max; i++)
      {
         if(k % i == 0 && m % i == 0)
         {
            result = i;   
         }
      }
      return result; 
   }
}