public class Problem75
{
   public static void main(String[]args)
   {
     int x = 7; 
     
     char[][] result = plusInSquare(x);
     
     for(int i = 0; i < result.length; i++)
      {
         for(int j = 0; j < result[0].length; j++)
         {
            System.out.print(result[i][j]+" ");
         }
         System.out.println();
      }   
   }
   public static char[][] plusInSquare(int n)
   {
      char[][] result = new char[n][n];
      
      for(int i = 0; i < result.length; i++)
      {
         for(int j = 0; j < result[0].length; j++)
         {
            if(i == (result.length / 2) || i == 0 || i == (result.length-1) || j == 0 || j == (result[i].length-1) || j == (result[i].length / 2))
               result[i][j] = 'X';
            else
               result[i][j] = '.';   
         }
         System.out.println();
      }
      return result; 
   }
}