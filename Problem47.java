public class Problem47
{
    public static void main(String[] args)
    {
        int myArr[] = {10,5,100,3,6,2,30};
        
       int result = evenSUmMinusOddProduct(myArr); 
       
       System.out.print(result); 
    }
    public static int evenSUmMinusOddProduct(int[] a)
    {
        int product = 1; 
        
        int sum = 0;
        
        int result = 0; 
        
         
        
        for(int i = 0; i < a.length; i ++)
        {
            if(i % 2 == 0 )
            {
                sum = sum + a[i]; 
            }
            else
            {
                product = product * a[i]; 
            }
            
            if( product > sum)
            {
                result = product - sum; 
            }
            else
            {
                result = sum - product; 
            }
        }
        return result; 
        
    }
}