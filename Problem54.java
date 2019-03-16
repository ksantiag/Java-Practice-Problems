//method firstSquare(int[] a)
//returns smallest index, creat an min var
//create a result var set to -1
public class Problem54{
   
   public static void main(String[] args){
      
      int[] a = {10,5,100,20,55,33,55,70};
      
      int result = firstSquare( a);
      
      System.out.print(result); 
   }
   public static int firstSquare(int[] a){
   
      int result = -1, min = a.length-1,count = 0; 
      
      for(int i = 0; i < a.length; i++){
         
         if(a[i] < (i * i)){
            result = i; 
            count++;
            
            if(i < min){
               min = i; 
            }
         }           
      }
      if(count > 0)
      {
         result = min; 
      } 
      return result; 
   }
}