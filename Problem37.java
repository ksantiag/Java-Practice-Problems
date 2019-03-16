//method whichSumIsLarger(int[] myArray)
//get sum of even ints
//get some of odd ints
//if evens are > evens are greater return 2
//odds return 3
//tie 7
public class Problem37
{
   public static void main(String[] args)
   {
      int[] a = {2,9,4,11,5,13,20,99,6};
      
      int result = whichSumIsLarger(a);
      
      System.out.print(result);
   }
   public static int whichSumIsLarger(int[] myArray)
   {
      int sume = 0, sumo = 0, result = 0; 
      
      for(int i = 0; i < myArray.length; i++)
      {
         if(myArray[i] % 2 == 0)
            sume += myArray[i];
         else
            sumo+= myArray[i];   
      }
      if(sume > sumo)
      { 
         System.out.print("Evens are greater ");
         result = 2;
      }
      else if(sumo > sume)
      {
         System.out.print("Odds are greater ");
         result = 3;   
      }
      else
      {
         System.out.print("Tie ");
         result = 7;
      } 
      return result;  
   }
}