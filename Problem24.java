public class Problem24
{
   public static void main(String[] args)
   {
      int n = 5;
      
      char [][] result = xPatternArray(n);
      
       for (int i=0; i<2; i++){
            for (int j =0; j<3; j++){
                System.out.print(result[i][j]);
            }
   }
   }
   public static char[][] xPatternArray(int n)
   {
      
      char da = new char[n][n];
      
      for(int row = 0; row < da.length; row++)
      {
      
         for(int col = 0; col < row; col++)
         {
            if(da[row][col] == row || da[row] + da[col] == n-1)
            {
               da[row][col] = 'x';
            }
            else
               da[row][col] = '-';
         }
      }
   }
}