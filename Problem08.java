public class Problem8
{

public static void main(String[] args)
{

   int [] A = {6,8,15,22,77,93,98};
   int [] B = {5,15,22,93,98}; 

   int result = howManyInCommon(A, B); 

   System.out.print(result); 
}
public static int howManyInCommon(int[]A, int[]B)
{

   int count = 0; 

   for(int i = 0; i < A.length; i++)
   {

      for(int j = 0; j < B.length; j++)
      {
   
         if(A[i] == B[j])
         {
         
            count++; 
         }
      }  
   }
     return count; 
 }
}         