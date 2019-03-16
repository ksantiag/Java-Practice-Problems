public class Problem14 {
  
 public static void main(String[] args)
 {
    int[] A = {15,8,5,2,7,9};
    int[]B={15,1,22,2,7};
    
    int result = largestInCommon(A,B);
    
    System.out.print(result);
 }
 public static int largestInCommon(int[] a, int[] b)
 {
    
    int max2=0;
    int max = -1;
    
    
  for(int i = 0; i < a.length; i++)
  {
   for(int j = 0; j < b.length; j++)
   {
      if(a[i] == b[j])
      {
         if(a[i] > max)
         {
            max = a[i]; 
         }
      }
 
   }
 
   
    return max;
 }

}