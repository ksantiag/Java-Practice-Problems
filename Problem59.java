//mostSmallerValuesToLeft(int[] myNums)
//no repeated values int array
//nested loop to check values to left of the index
// starting at 1

public class Problem59{

   public static void main(String[] args){
   
      int[] myNums = {10,50,80,70,35,60,40};
      
      int result = mostSmallerValuesToLeft(myNums);
      
      System.out.print(result); 
   }
   public static int mostSmallerValuesToLeft(int[] myNums){
      
      int result = 0, count = 0, max = 0; 
      
      for(int i = 1; i < myNums.length; i++){
         for(int j = 0; j < i; j++){
            
            if(myNums[j] < myNums[i]){
            
               count++;
               
               if(count > max){
               
                  max = count;
                  result = myNums[i];
               }   
               
            }   
         }
         count = 0;
      }
      return result; 
   }
}