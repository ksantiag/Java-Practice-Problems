public class Problem71
{
   public static void main(String[] args)
   {
      /*int[][] a = {{3,6,7,2},
                   {1,0,5,9}}; 
      int x = 0, y = 3;
      
      int[][] result = switchColums(a, x, y);*/
      int[][] a = {{31,  3, 17},
                   { 7, 40,  5},
                   {12,  8, 89}};
      
      int x = 2, y = 1;
      int[][] result = switchColums(a, x, y);             
      
      for(int i = 0; i < result.length; i++)
      {
         for(int j = 0; j < result[0].length; j++)
         {
            System.out.print(result[i][j]+" ");
         }
         System.out.println();
      }                
   }
   public static int[][] switchColums(int[][] a, int x, int y)
   {
      int[][] result = new int[a.length][a[0].length];
      
      for(int i = 0; i < result.length; i++)
      {
         for(int j = 0; j < result[0].length; j++)
         {
            if(j == x)
            {
               result[i][j] = a[i][y];
            }
            else if(j == y)
            {
               result[i][j] = a[i][x];
            } 
            else
            {
               result[i][j] = a[i][j];
            } 
         }
         
      } 
      
      return result; 
   }
}