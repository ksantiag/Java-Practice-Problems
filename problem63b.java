public class problem63b
{
   int [] nums = {41,38,75,98,26,51,118,13};
   int [] a = new int[10]; 
   
   int cnt; 
   int k = 0; 
   
   for(int i = 0; i < nums.length; i++)
   {
      if(nums[i] % 10 == i)
      {
         cnt++; 
         a[k] = cnt;   
      }
   }
}