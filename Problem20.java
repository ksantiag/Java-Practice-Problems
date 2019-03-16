public class Problem20
{
   public static void main(String[] args)
   {
      double myA[] = {1.5,2.0,1.0,9.0,1.5,9.5,2.5};
      
      double[] result = seperate(myA);
      
      for(int i = 0; i < result.length; i++)
      {
         System.out.print(result[i]+" ");
      }
   }
   public static double [] seperate(double [] myA)
   {
      double sum = 0.0, average = 0.0;
      
      int j = 0;
      
      for(int i = 0; i < myA.length; i++) 
      {
         sum += myA[i];
      } 
      average = sum / myA.length;   
      
      double[] newA = new double[myA.length+1];
      
      int i = 0;
      for(i = 0; i < myA.length; i++)
      {
         if(myA[i] < average)
         {
            newA[j] = myA[i];
            j++;
         }
      }
      newA[j] = average;  
      j++;
      
       for( i = 0; i < myA.length ; i++)
      {
         if(myA[i] > average)
         {
            newA[j] = myA[i];
            j++;
         }
      }
      return newA;
   }
}