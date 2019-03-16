//method elementsBiggerThan(int[] a, int n)
//returns an int
//check to see if a[i] > n

public class Problem41
{
   public static void main(String[] args)
   {
      int[] a = {1,10,-7,5,10};
      
      int n = 40; 
      
      int result = elementsBiggerThan(a, n);
      
      System.out.print(result); 
   }
   public static int elementsBiggerThan(int[] a, int n)
   {
      int counter = 0; 
      
      for(int i = 0; i < a.length; i++)
      {
          if(a[i] > n)
            {
               counter++; 
            }
         
      }
      return counter; 
   }
}