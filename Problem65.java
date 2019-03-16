import java.util.Scanner; 

public class Problem65
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int x = 0;
      int y = 0; 
      int z = 0; 
      
      int day = 0;
      int years = 0; 
      int week = 0; 
       
       
      int cnt = 0; 
      
      System.out.print("Enter the number of years, weeks, and day: ");
      x = input.nextInt(); 
      y = input.nextInt(); 
      z = input.nextInt(); 
      
      
      years = x; 
      week = y;
      day = z; 
       
      x = x * 365; 
      y = y * 7;
      
      day = x+y+z; 
      
      System.out.print(years+" years, "+week+" weeks, and "+z+" days is the same day: " +day); 
   }
}