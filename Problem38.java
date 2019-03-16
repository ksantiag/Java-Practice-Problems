//method interleave(int[]a, int[] b)
//dont have to be same length
//HOORAY FOR TRACING!!!!!!
//FEW ERRORS BUT NOT A PASSING
public class Problem38
{
   public static void main(String[] args)
   {
      int[] a = {7,8,9};
      int[] b = {33,22,11};
      
      int[] result = interleave(a, b);
      
      for(int i = 0; i < result.length; i++)
      {
         System.out.print(result[i]+" "); 
      }
   }
   public static int[] interleave(int[]a, int[] b)
   {
      int size = a.length + b.length;
      int count = 0, i = 0, j = 0;  
      int[] result = new int[size];
      
      
      while(count < size)
      {
         if(i < a.length)
         {
            result[count] = a[i];
            i++;
            count++;
         }
         if(j < b.length)
         {
            result[count] = b[j];
            j++;
            count++;
         }
      }
      return result;  
   }
}