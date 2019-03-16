public class Problem9{


   public static void main(String[] args){
   
      int [] A = {6,103,77,49,0,83,77,77,444,444};
   
      int b = 77; 
   
      int [] result = newSmallerArray(A, b); 
   
      for(int i = 0; i < result.length; i++){
         System.out.print(result[i]+" ");
            
      }
   }
   public static int [] newSmallerArray(int A[], int b){
      
      int count = 0; 
      int k = 0; 
      
      for(int i = 0; i < A.length; i++){
         if(A[i] == b){
            
             count++; 
            }
         }
      int [] result = new int[A.length-count];
      
      for(int i = 0; i < A.length; i++){
         if(A[i] != b){
            result[k] = A[i];
            k++; 
         }
      }
      return result; 
         
      
   }
   
 }     