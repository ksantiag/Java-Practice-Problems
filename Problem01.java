public class Problem1
{
   public static void main(String[] args)
   {
      int[][] A = {{5,100,1,5},
                 {1,2,1,15},
                 {8,7,5,3},
                 {6,1,13,1}};
      
      int result = indexOfHigestRowSum( A);
      
      System.out.print(result);
                  
   }
   public static int indexOfHigestRowSum(int[][] a)
   {
      int index = -1, sum = 0, max = a[0][0]; 
      
      for(int i = 0; i < a.length; i++)
      {
         sum = 0;
          
         for(int j = 0; j < a[0].length; j++)
         {
            sum+=a[i][j];   
         }
         if(sum > max)
         {
            max = sum; 
            index = i; 
         }
      }
      return index;
      
   }
}