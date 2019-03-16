//fibNumbers(int n)
//array starts off result[0] = 0 and result[1] = 1
// then flowing elements in array will be the sum of the prevous 2 numbers
//Always find a way to solve without returning in the statements
public class Problem70
{
   public static void main(String[] args)
   {
      int n = 20; 
      
      int[] result = fibNumbers(n);
      
      for(int i = 0; i < result.length; i++)
      {
         System.out.print(result[i]+" ");
      }
   }
   public static int[] fibNumbers(int n)
   {
      int[] result = new int[n+1];
      
      if(n == 1)
      {
         result[1] = 1; 
         result[0] = 0; 
      }
      else if(n == 0)
      {
         result[0] = 0; 
      }
      else
      {
         result[1] = 1; 
         result[0] = 0;
         
         for(int i = 2; i < result.length; i++)
         {
            result[i] = result[i-2]+result[i-1];   
         }
      }   
      /*int[] zero = {0};
      if(n == 1)
      {
         int[] result = new int[2];
         result[1] = 1; 
         result[0] = 0; 
      }
      else{
         int[] result = new int[n+1];
         result[1] = 1; 
         result[0] = 0;
         
         for(int i = 2; i < result.length; i++)
         {
            result[i] = result[i-2]+result[i-1];   
         }
         return result;  
      }
      return zero;*/
      return result;
   }
}