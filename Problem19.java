public class Problem19
{
   public static void main(String[] args)
   {
      int[] a = { 81, 81, 81, 17, 17, 97,7,7,1,81,39,5,39,39};
      
      int result = mostFrequentValue(a);
      
      System.out.print(result); 
   }
   public static int mostFrequentValue(int[] myArray)
   {
      int max = 0, count = 0, result = 0; 
      
      for(int i = 0; i < myArray.length; i++)
      {
         count = 0; 
         
         for(int j = 0; j < myArray.length-1; j++)
         {
            if(myArray[i] == myArray[j])
            {
               count++;
               if(myArray[j] != myArray[j+1])
               {
                  if(count > max)
                   {
                     max = count; 
            
                   }
                  count = 0;
               } 
            }
            
         }
         /*be careful not set the max to the number at 
         the location vs how many time it was counted.*/
         if(count > max)
         {
            max = count; 
            
         }
      }
      return max; 
   }
}