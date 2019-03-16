public class Problem69
{
  public static void main(String [] args)
   {

    boolean [] test = {true, false, false, false, false, true, true, true, true, true};
    
    boolean test1 = longerTF(test);
    
    System.out.print(test1);


   }
  public static boolean longerTF(boolean [] guess)
   {
     int maxT = 0;
     int maxF = 0;
     int countT = 0;
     int countF = 0;
     boolean value;
     for(int i = 0; i < guess.length; i++)
        {
          if (guess[i] == true)
            {
            countT++;
            if(countT > maxT)
            maxT = countT;
            }
            else 
             countT=0;
        }

      for(int i = 0; i < guess.length; i++)
        {
            if (guess[i] == false)
              {
              countF++;
              if (countF>maxF)
              maxF = countF;
              
           
              }
            else 
               countF=0;
       }
    
    if(maxT > maxF)
         value = true;
      else 
         value = false;


    return value;

  }
 } 