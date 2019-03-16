public class Problem64
{
   public static void main(String[] args)
   {
      int [] nums = {41,38,75,98,26,51,118,13};
      
      int [] result= lastDigits(nums); 
      
      for(int i = 0; i < result.length; i++)
      {
         System.out.print(result[i]);
      }
   }
   public static int[] lastDigits(int [] myNums)
   {
      
      int k = 0;
      
      int cnt=0; 
      
      int[] newa = new int[10]; 
      
      for(int i = 0; i < 10; i++)
      {
         
         for(int j = 0; j < myNums.length; j++)
         {
            
            if(myNums[j] % 10 == i )
            {
            
               cnt++; 
               newa[i]=cnt;
               
            }
        
         }
         cnt=0;
         //k++; 
           
      }
      return newa;
   }
}