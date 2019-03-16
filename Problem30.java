public class Problem30
{
   public static void main(String[] args)
   {
      int size = 8;
      int start = 5; 
      int increment = 4;
      
      int [] result = createNewArray( size, start, increment); 
      
      for(int i = 0; i < result.length; i++)
      {
         System.out.print(result[i]+" "); 
      }
   }
   public static int []createNewArray(int size, int start, int increment)
   {
      int [] newArray = new int[size]; 
      
      newArray[0] = start; 
      
      for(int i = 1; i < newArray.length; i++)
      {
         newArray[i] = newArray[i-1] + increment;      
      }
      
      return newArray;    
    }
}