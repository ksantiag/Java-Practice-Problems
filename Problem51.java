//method sandwich(int[] myArr)
//Assume length of Array is at least 3
//1<= t <= array.length-2
//Ask the professor about this 
public class Problem51
{
   public static void main(String[] args)
   {
      int[] myArr = {1,1,3,3,4,5,6};
      
      int result = sandwich(myArr); 
      
      System.out.print(result); 
   }
   public static int sandwich(int[] myArr)
   {
      int result = -1; 
      
      for(int t = 1; t < myArr.length-1; t++)
      {
         
         if((myArr[t-1] * myArr[t+1]) == myArr[t]) 
         {
            result = t; 
         } 
      }
      return result; 
   }
}