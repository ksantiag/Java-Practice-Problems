import java.util.Scanner; 

public class Problem55
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int[] nums; 
      int value = 0; 
      
      do{
         System.out.print("Enter a positive integer: ");
         value = input.nextInt();
         
      }while(value <= 0);  
      
      nums = new int[value];
      
      System.out.print("Now enter "+value+" integers: ");
      for(int i = 0; i < value; i++)
      {
         nums[i] = input.nextInt();
      } 
      int largest = nums[0]; 
      int odd = 0; 
      int sum = 0; 
      
      for(int i = 0; i < value; i++)
      {
         if(nums[i] > largest)
         {
            largest = nums[i];
         }
         if(nums[i] % 2 != 0)
         {
            odd++;
         }
         sum+=nums[i];
      }
      System.out.println("Largest value entered: "+largest);
      System.out.println("Number of odd value: "+odd);
      System.out.println("sum of all values: "+sum);
   }
}