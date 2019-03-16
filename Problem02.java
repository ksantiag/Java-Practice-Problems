public class Problem2
{
   public static void main(String[] args)
   {
      int [] freq = {3, 1, 5, 2};
      
      char [] text = {'m','s','k','p'};
      
      char [] result = repeatChars(freq, text); 
      
      for(int i = 0; i < result.length; i++)
      {
         System.out.print(result[i]); 
      } 
      
      
   }
   public static char [] repeatChars(int[]freq, char[]text)
   {
      int sum = 0; 
      int k = 0; 
      
      for(int i = 0; i < freq.length; i++)
      {
         sum = sum + freq[i]; 
      }
      
      char [] newArr = new char[sum]; 
      
      for(int i = 0; i < freq.length; i++)
      {
         for(int j = 0; j < freq[i]; j++)
         {
            newArr[k] = text[i];
            k++;  
         }
        
      }
      return newArr; 
   }
}