public class problem52
{
    public static void main(String[] args)
    {
        int arr [][] = { {50, 20, 80, 90, 100}, 
                         {77, 555, 9, 44, 66}, 
                         {888, 15, 302, 90, 123}, 
                         {31, 29, 30, 32, 28} };
                         
        int result = maxOfMins(arr); 
        
        System.out.println(result); 
                             
    }
    public static int maxOfMins(int[][] arr)
    {
        int max = 0;
        int min;   
        
        for(int row = 0; row < arr.length; row++)
        { 
            min = arr[0][0];
            for(int col = 0; col < arr.length; col++)
            {
               if(arr[row][col] < min)
               {
                min = arr[row][col];
                
               }
                  
            }
            if(min > max)
               {
                max = min; 
               } 
                
        }
        return max; 
    }
}