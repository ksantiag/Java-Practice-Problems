public class Problem10
{
   public static void main(String[] args)
   {
      int myArray[] = {8,88,0,29,5,44,44,8,0,9,99};
      
      int result = indexOfFirstPair(myArray); 
      
      System.out.print(result);
   }
   public static int indexOfFirstPair(int[] myArray)
   {
      
      int index = -1; 
      
      for(int i = 1; i < myArray.length-1; i++)
      {
        if(myArray[i] == myArray[i+1])
        {
            
            if(myArray[0] == myArray[1] && myArray[2] != myArray[0])
                {
                    return 0; 
                }
            else if(myArray[i+2] != myArray[i] && myArray[i -1] != myArray[i])
                {
                    return i;
                }
            else if(myArray[myArray.length -1] == myArray[myArray.length-2] && myArray[myArray.length-3] != myArray[myArray.length-1])
                {
                    return myArray.length-2; 
                }
         }
        
      }
      return -1;    
   }
}