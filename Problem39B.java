//input from user imoprt and scanner
////takes 3 ints
// displays their sum
//if sum is either multiple of 3 and 5 print out twice 
//if its both 3 and 5 print triple
import java.util.Scanner;

public class Problem39B
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int x, y, z, sum = 0;
      
      System.out.print("Enter an int: ");
      x = input.nextInt();
      
      System.out.print("Enter another int: ");
      y = input.nextInt();
      
      System.out.print("One more, please: ");
      z = input.nextInt();
      
     sum = x + y + z;
     
     if(sum % 3 == 0 && sum % 5 == 0)
     {
      sum = sum * 3;
     }
     else if(sum % 3 == 0 || sum % 5 ==0)
     {
      sum = sum * 2;
     }
     
     System.out.print("Result: "+sum);
      
   }
}
