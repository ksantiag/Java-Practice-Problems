public class Problem43
{
   public static void main(String[] args)
   {
    int n = 4; 
    
    int [][] result = numberTriangleArray(n); 
    
   for(int outer = 0; outer < result.length; outer++)
      {
         for(int inner = 0; inner < result[outer].length; inner++)
         {
            System.out.print(result[outer][inner]+" ");
           
         }
            System.out.println();
         }
    }

   public static int [][]numberTriangleArray(int n)
   {
      
      int k = n; 
      
      for(int row = 0; row < k; row++)
      {
         for(int col = 0; col < n; col++)
         {
            if(row == col)
            {
               System.out.print
            }
         } 
         n++; 
      }  
   }
}