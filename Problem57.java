//method sumOfDIgits(int n)
//divide and mod until 0 pur mod into a sum var +=
public class Problem57{
   
   public static void main(String[] args){
      
      int n = 56;
      
      int result = sumOfDigits(n);
      
      System.out.print(result); 
   }
   public static int sumOfDigits(int n){
      
      int sum = 0; 
      
      while(n > 0){
         
        sum += n % 10;
        
        n = n/10; 
      }
      return sum; 
      
   }
}
