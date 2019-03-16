//method addEvenSubOdds(int[] a)
//add even elements subtract odds
//even - odds
public class Problem45
{
   public static void main(String[] args)
   {
      int[] a = {10,0,11,44,19,46};
      
      int result = addEvenSubOdds(a);
      
      System.out.print(result); 
   }
   public static int addEvenSubOdds(int[] a)
   {
      int evens = 0, odds = 0;
      
      for(int i = 0;i < a.length; i++)
      {
         if(a[i] % 2 == 0)
         {
            evens += a[i]; 
         }
         else
         {
            odds += a[i];
         }    
      } 
      return(evens - odds);
   }
}
