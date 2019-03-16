//goingWhichWay(int[] myArray)
//return int and a print a statment
//dont change myArray
//If already storted strictly increasing print UP return 111
//"""""""""""""""""" """""""""Decreasing print down return 222
//if its  neither neither
//check an element and neighbor to see if greater 
public class Problem27
{
   public static void main(String[] args)
   {
      int[] myArray= {20,30,50,50,70,90};
      
      int result = goingWhichWay(myArray);
      
      System.out.print(result); 
   }
   public static int goingWhichWay(int[] myArray)
   {
      int increasing = 0, decreasing = 0, result = 0; 
      
      for(int i = 0; i < myArray.length-1; i++)
      {
         if(myArray[i] < myArray[i+1])
         {
            increasing++; 
         }
         else if(myArray[i] > myArray[i+1])
         {
            decreasing++;
         }
      }
      if(increasing == myArray.length-1)
      {
         System.out.print("UP ");
         result = 111; 
      }
      else if(decreasing == myArray.length-1)
      {
         System.out.print("Down ");
         result = 222;   
      }
      else
      {
         System.out.print("Neither ");
         result = 333; 
      }
      
      return result; 
      
      
      
   }
}
