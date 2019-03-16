//Method vowelConstant(char[]x. char[]y)
//Method returns new array of char[]
//takes vowels from x and constants from y
//ASUME they are all capital letters

public class Problem25
{
   public static void main(String[] args)
   {
      char[] x = {'A', 'L', 'I', 'O', 'P','U'};
      char[] y = {'K', 'E', 'N','N', 'Y'};
      
      char[] result = vowelConstant(x, y);
      
      for(int i = 0; i < result.length; i++)
      {
         System.out.print(result[i]+" ");
      }   
        
   }
   public static char[] vowelConstant(char[]x, char[]y)
   {
      int countx = 0, county = 0;  
      
      for(int i = 0; i < x.length; i++)
      {
         if(x[i] == 'A' || x[i] == 'E' || x[i] == 'I' || x[i] == 'O' || x[i] == 'U')
            countx++;  
      }
      for(int i = 0; i < y.length; i++)
      {
         if(y[i] != 'A' && y[i] != 'E' && y[i] != 'I' && y[i] != 'O' && y[i] != 'U')
            county++;  
      }
     
      
      char[] result = new char[countx + county];
      
      int i = 0, k = 0; 
      
      for(i = 0; i < x.length; i++)
      {
         if(x[i] == 'A' || x[i] == 'E' || x[i] == 'I' || x[i] == 'O' || x[i] == 'U')
            {
               result[k] = x[i];
               k++;
            }
      }
      for(i = 0; i < y.length; i++)
      {
         if(y[i] != 'A' && y[i] != 'I' && y[i] != 'O' && y[i] != 'U'&& y[i] != 'E' )
            {
               result[k] = y[i];
               k++;
            }
                 
      }
      return result; 
   }
}