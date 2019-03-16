public class Problem11
{
   public static void main(String[] args)
   {
      int a = 3, b = 6;
      
      int result = rangeProduct(a,b);
      
      System.out.println(result);    
   }
   public static int rangeProduct(int a, int b)
   {
      int product = 1; 
      
      for( int i = a; i <= b; i ++)
      {
         product *= i; 
      } 
      return product;  
   }
}