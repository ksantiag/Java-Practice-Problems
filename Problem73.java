//consolidate(char[] a, char[] b)
//evens from a and b then  odds from a and b
//better instructions next time it was evens from a odds from then odds a evens from b
//could of just used a o b length
public class Problem73
{
   public static void main(String[] args)
   {
      char[] a = {'x','f','q',};
      char[] b = {'s','d','g',};
      
      char[] result = consolidate( a, b);
      
      for(int i = 0; i < result.length; i++)
      {
         System.out.print(result[i]);
      }
   }
   public static char[] consolidate(char[] a, char[] b)
   {
      int j = 0;
      char[] result =  new char[a.length + b.length];
      
      for(int i = 0; i < result.length / 2; i++)
      {
         if(i % 2 == 0)
         {
            result[j] = a[i];
            j++;
         }
      }
       for(int i = 0; i < result.length / 2; i++)
      {
         if(i % 2 != 0)
         {
            result[j] = b[i];
            j++;
         }
      }
      for(int i = 0; i < result.length / 2; i++)
      {
         if(i % 2 != 0)
         {
            result[j] = a[i];
            j++;
         }
      }
       for(int i = 0; i < result.length / 2; i++)
      {
         if(i % 2 == 0)
         {
            result[j] = b[i];
            j++;
         }
      }
      return result;
   }  
}