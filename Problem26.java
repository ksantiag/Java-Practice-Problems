//middleValue(int a, int b, int c)
//returns an int
//returns the middle value of the 3 ints 
//can be in any order;
public class Problem26
{
   public static void main(String[] args)
   {
      int a = 7, b = 9, c = 4; 
      
      int result = middleValue(a, b, c); 
      
      System.out.print(result); 
   }
   public static int middleValue(int a, int b, int c)
   {
      int result = 0; 
      
      if((a < b && b < c) || (c < b && b < a))
         result = b;
      else if((b < a && a < c) || (c < a && a < b))
         result = a; 
      /*else if((a < c && c < b) || (b < c && c < a))
         result = c;*/
      else
         result = c;    
         
     return result;          
   }
}