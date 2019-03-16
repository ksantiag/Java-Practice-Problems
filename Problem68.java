public class Problem68
{
   public static void main(String[] args)
   {
      int[][]a={{9,0,0,0,9,0},
                {9,2,1,4,7,0},
                {0,2,5,0,20,0},
                {0,10,9,4,8,0},
                {0,20,0,5,0,9},
                {0,9,0,0,0,0}};
      
      int b = 18;
      
      int result = sumTarget(a,b); 
      
      System.out.print(result);          
                    
   }
   public static int sumTarget(int[][]table, int target)
   {
      int result = table.length+1, sumRow = 0, sumTotal=0, sumCol = 0, index = -1; 
      
      for(int i = 0 ; i < table.length; i++)
      {
         sumRow = 0;
         sumCol = 0;
         for(int j = 0; j < table[0].length; j++)
         {
            sumRow += table[i][j];     
         }
         
         for(int k = 0; k < table.length; k++)
         {
            sumCol += table[k][i];   
         }
         
         sumTotal = sumRow+sumCol - table[i][i];
         
         if(sumTotal == target)
         {
            index =  i; 
            
            if(index < result)
            {
               result = index; 
            }
         }
         
        
           
         
      }
      //had to set it up this way to return smallest index
      if(index == -1)
         return index;
      else
         return result;     
   
   }
}