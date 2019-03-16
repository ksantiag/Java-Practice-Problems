//assume at least 2 an even length  
// increment by 2 stop at a.length -1 
public class Problem74
{
   public static void main(String[] args)
   {
      int[] a = {10,5,100,3,6,2,30,20};
      
      int result = sumOfProducts( a);
      
      System.out.print(result);
      
   }
   public static int sumOfProducts(int[] a)
   {
      int sum = 0; 
      
      for(int i = 0; i < a.length-1; i = i+2)
      {
         sum += a[i] * a[i+1];    
      }
      return sum;
   }
}