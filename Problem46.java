public class Problem46

{
    public static void main(String [] args)
    {
    
    int [][]arr ={{3, 6, 7, 2},
                  {1, 0, 5, 9}};
    int x = 2;
    
    int [][] test = removeColumn( arr, x);
    
    
    for(int i = 0; i <test.length; i++)
      {
        for(int j = 0; j < test[i].length; j++)
         {
          System.out.print(test[i][j] + " ");
          
              
         }
       System.out.println();
      }
   }


    public static int [][] removeColumn(int[][] a, int x)
    {
     int[][]  ans = new int [0][0];
      if (x < a[0].length)
          {
          ans = new int [a.length][a[0].length - 1];
           int k=0;
           int m = 0;
            for(int i = 0; i < a.length; i++)
              {
               // k = k + i;
                m=0; 
                for(int j = 0; j < a[i].length; j++)
                 {
                
                 
                    if (j!=x )
                    {
                    ans[k][m] = a [i][j];
                    m++;
                    
                    }
                   
                 }
                 k++;
              }
           }  
              else 
                return a;
        
        return ans;
       


    }
}