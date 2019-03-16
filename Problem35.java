//method canFormRightTriangle(int a, int b, int c)
//check id a b c can be the lengths of a right triangle
//can be length if and only if all 3 are possitive
//
public class Problem35
{
   public static void main(String[] args)
   {
      int a = 6, b = 10, c = 8;
      
      boolean result = canFormRightTriangle( a, b, c);
      
      System.out.print(result);
   }
   public static boolean canFormRightTriangle(int a, int b, int c)
   {
      int max = 0, small = 0, middle = 0;
      
      boolean result = false; 
      
      max = Math.max(a, b);
      
      max = Math.max(max, c);
      
      if( a < b && a < c)
         small = a;
      else if( b < c && b < a)
         small = b;
      else if( c < a && c < b)
         small = c;
      
      if((b < a && a < c) || (c < a && a < b))
         middle = a;
      else if((a < b && b < c )|| (c < b && b < a))
         middle = b; 
      else if((a < c && c < b) || (b < c && c < a))
         middle = c;      
                
      if(a < 1 || b < 1 || c < 1)
      {
         result = false; 
      }
      else if((small * small) + (middle * middle) == (max * max))
      {
         result = true;
      }
      return result; 
   }

}
//way easier subtract max and min from sum to get mid duh!!!

/*public class Problem35
{
      public static void main(String [] args)
      {
         int a=3, b=4, c=5;
         
         boolean test = canFormRightTriangle(a,b,c);
         System.out.print(test);

      }
      public static boolean canFormRightTriangle(int a, int b, int c)
      {
        boolean traingle = false;
        int max = Math.max(a, (Math.max(b, c)));
        int min = Math.min(a, (Math.max(b, c)));
        int sum = a + b + c;
        int middle = sum - max - min;
            
            if ( a > 0 && b > 0 && c > 0)
               {
                  if (max * max  ==(min * min) + (middle * middle))
                    traingle = true;
               
               
               }
          
          
      return traingle;
      
      
      
      
      
      }
} */