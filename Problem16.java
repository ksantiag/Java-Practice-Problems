public class Problem16
{
   public static void main(String[] args)
   {
      int a = 1; 
      int b = 3;
      int c = 3; 
      int d = 3; 
      
      boolean result = atLeastThreeMatch(a,b,c,d);
      
      System.out.print(result);
      
      
   }
   public static boolean atLeastThreeMatch(int a,int b,int c,int d)
   {
      if(a == b && a == c || a==b && a==d || a==c && a==d)
      {
         return true; 
      }
     
      if(b == a && b == c || b==a && b==d ||b==c && b==d)
      {
         return true; 
      }
      if(c == b && a == c || c==b && c==d || c==a && c==d)
      {
         return true; 
      }
      if(d == a && d == b || d==c && a==d || d==c && d==b)
      {
         return true; 
      }
      return false; 
   }
}