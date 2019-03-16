//method isPerfect(int n)
//create loop and add factors compare to n

public class Problem44
{
   public static void main(String[] args)
   {
      int n = 20;
      
      boolean result = isPerfect(n);
      
      System.out.print(result);
   }
   public static boolean isPerfect(int n)
   {
      boolean isPerfect = false; 
      int sum = 0;
      
      for(int i = 1; i < n; i++)
      {
         if(n % i == 0)
         {
            sum += i; 
         }
      }
      if(n == sum)
      {
         isPerfect = true; 
      }
      return isPerfect;
   }
}