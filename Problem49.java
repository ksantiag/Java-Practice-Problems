public class Problem49
{
   public static void main(String[] args)
   {
      char[] a = {'a','b','c','d','e'};
      char[] b = {'e','d','c','b','a'};
      
      boolean result = areReversed(a, b);
      
      System.out.print(result);   
   }
   public static boolean areReversed(char[]a, char[]b)
   {
      boolean result = false;
      
      char[] test = new char[a.length];
      
      int j = 0, count = 0; 
      
      if(a.length != b.length)
      {
         result = false;
      }
      else
      {
         for(int i = a.length-1; i >= 0; i--)
         {
            test[j] = a[i];
            j++;
         }
         for(int i = 0; i < b.length; i++)
         {
            if(test[i] == b[i])
            {
               count++;
            }
         }
         if(count == b.length)
         {
            result = true; 
         } 
      }
      return result;    
   }
}