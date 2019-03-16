public class Problem05
{
   public static void main(String[] args)
   {
      int a [] = {7,6,5};
      int b [] = {7,6,5,3,6,5};
      
      boolean result = appearsConsecutively(a, b);
      
      System.out.print(result);
   }
   public static boolean appearsConsecutively(int [] a, int [] b)
   {
      int count = 0; 
      boolean result = false; 
      
      for(int i = 0; i < b.length-a.length-1; i++)
      {
         count = 0; 
         int k = 0;
         for(int j = 0; j < a.length; j++)
         {
            
            if(a[j] == b[i+k])
            {
               count++;
            }
            k++;
         }
         if(count == a.length)
            return true;
      }
      return false;   
   }
}    