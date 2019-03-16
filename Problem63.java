public class Problem63
{
   public static void main(String[] args)
   {
      int[][]table = {{5,3,0,0,2,2},
                      {0,10,0,-5,8,0},
                      {1,0,-5,10,7,7},
                      {1,3,9,0,0,0},
                      {1,0,6,4,1,1}};
      int result = rowWithMostZeros(table); 
      
      System.out.print(result);                  
   }
   public static int rowWithMostZeros(int[][]table)
   {
      int cnt = 0; 
      int index = 0;
      int max = -1; 
       
      for(int row = 0; row < table.length; row++)
      {
         cnt = 0;
         for(int col = 0; col < table[row].length; col++)
         {
            if(table[row][col] == 0)
            {
               cnt++;
                
            }
            if(cnt > max || cnt == max)
            {
               max = cnt;
               index = row;
                   
            }
         }
      }
      return index;  
   }
}