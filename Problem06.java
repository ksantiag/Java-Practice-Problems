import java.util.Scanner; 

public class Problem06{
   
   public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      
      int a, b, c, count = 0; 
      
      System.out.print("Enter a: ");
      a = input.nextInt();
      if( a % 2 != 0)
         count++;
      System.out.print("Enter b: ");
      b = input.nextInt();
      if( b % 2 != 0)
         count++;
      System.out.print("Enter c: ");
      c = input.nextInt();
      if( c % 2 != 0)
         count++;
         
      System.out.println();
      
      if(count == 3)
         System.out.print("Three integers were odd.");
      else if(count == 2)
         System.out.print("Two integers were odd."); 
      else if(count == 1)
         System.out.print("One integers was odd.");
      else  
         System.out.print("No integers were odd.");        
      
         
         
               
         
   }
}