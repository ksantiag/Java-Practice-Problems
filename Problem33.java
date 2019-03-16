//firstValueThreeInARow(int[] myArray)
//returns an int
//Assum all possitive
//-1 if none
//check backwards homie
//missed a closing parentasis

public class Problem33
{
   public static void main(String[] args)
   {
      int[] myArray = {20,30,20,7,7,5,12,19,12,12,7,1,0,1,20};
      
      int result = firstValueThreeInARow(myArray);
      
      System.out.print(result); 
   }
   public static int firstValueThreeInARow(int[] myArray)
   {
      int result = -1; 
      
      for (int i = myArray.length - 2; i >= 1; i--)
      {
         if(myArray[i-1] == myArray[i] && myArray[i] == myArray[i+1])
         {
            result = myArray[i];
         }
      }
      return result;
      
      
      
      
   }
}