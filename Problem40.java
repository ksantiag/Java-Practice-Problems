//method isPrime(int n)
//returns true if n is a prime number

public class Problem40
{
   public static void main(String[] args)
   {
      int n = 9967;
      
      boolean result = isPrime(n);
      
      System.out.print(result);
   }
   public static boolean isPrime(int n)
   {
      boolean isPrime = false; 
      int count = 0; 
      
      for(int i = 1; i <=n; i++)
      {
         if(n % i == 0)
         {
            count++; 
         }
      }
      if(count == 2)
      {
         isPrime = true; 
      }  
      return isPrime;  
   }
}