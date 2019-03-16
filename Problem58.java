public class Problem58
{
   public static void main(String[] args)
   {
      int[][] table = {{5,3,0,0,2},
                       {0,10,10,-5,8},
                       {1,0,-5,10,7},
                       {1,3,4,0,0},
                       {1,0,6,4,1}};
                        
      int result = innerOutter(table);
      
      System.out.print(result);                  
   }
   public static int innerOutter(int[][] table)
   {
      int sumOut = 0, sumIn = 0;
       
      for(int i = 0; i < table.length; i++)
      {
         for(int j = 0; j < table[0].length; j++)
         {
            if(i == 0 || i == 4 || j == 0 || j == table.length -1)
            {
               sumOut+= table[i][j];
            }
            else
            {
               sumIn+=table[i][j];
            }
         }
         
      }
         System.out.println(sumOut);
         System.out.println(sumIn);
         int result = Math.max(sumOut, sumIn);
         
         return result;
   }
}