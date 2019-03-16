public class Problem25B
{
   public static void main(String[] args)
   {
       
   
      char[] x = {'E', 'Q', 'A', 'F', 'G','O','C', 'C', 'U', 'U', 'M','M' };
      char[] y = {'B', 'Z', 'B', 'U', 'U','H','H', 'O', 'A', 'E', 'A','E','P','A'};
      
      char[] result = vowelConstant(x, y);
      
      for(int i = 0; i < result.length; i++)
      {
         System.out.print(result[i]+" ");
      }   
        
   }
   /*public static char[] vowelConstant(char[]x, char[]y)
   {
      String v = "", c = "";
      
      for(int i = 0; i < x.length; i++)
      {
         v += x[i]+"";
      }
      for(int i = 0; i < y.length; i++)
      {
         c += y[i]+"";
      }
      v = v.replaceAll("[^AEIOU]", "");
      
      c = c.replaceAll("[AEIOU]", ""); 
      
      char[] newA = new char[v.length() + c.length()];
      
      int count = 0; 
      
      for(int i = 0; i < v.length(); i++)
      {
         newA[count] = v.charAt(i);
         count++;  
      }
      for(int i = 0; i < c.length(); i++)
      {
         newA[count] = c.charAt(i);
         count++;  
      }
      return newA; 
   }*/
   public static char[] vowelConstant(char[]x, char[]y)
{ 
int count = 0;
String charHold = ""; 
String answerStr = ""; 
for(int i=0; i<x.length; i++)
{
charHold = "" + x[i]; 
if (charHold.matches("[AEIOU]"))
{
count++;
answerStr += x[i]; 
}
}
for(int i=0; i<y.length; i++)
{
charHold = "" + y[i]; 
if(charHold.matches("[^AEIOU]"))
{
count++; 
answerStr += y[i]; 
}
}
char [] answer = new char[count]; 
for(int i=0; i<answerStr.length(); i++)
{
answer[i] = answerStr.charAt(i);
}
return answer; 
}
}   
