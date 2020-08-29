
package oop_assign02;

/*This is a robot simulation code written by Andrew Samuel*/
/* CS 3300-HYBRID M: [1:00-2:15]*/

public class RobotTest 
{
    public static void main(String[] args) 
    {
        String lb = ("********************************************************************************************************************************************************");
        int l = 0, m = 0, n = 0, o = 0, p = 0;
        int a = 0, b = 0, c = 0, d = 0, e = 0;
        
      RandomRobot rr = new RandomRobot();
      BiasedRobot br = new BiasedRobot();
      
      for (int x = 0; x <= 1000; x++)
      {
          int rq = rr.simulate(500);
          if (rq == 0)
          {
              l++;
          }
          else if (rq == 1)
          {
              m++;
          }
          else if (rq == 2)
          {
              n++;
          }
          else if (rq == 3)
          {
              o++;
          }
          else if (rq == 4)
          {
              p++;
          }       
      }
      
      for (int y = 0; y <= 1000; y++)
      {
          int bq = br.simulate(500);
          if (bq == 0)
          {
              a++;
          }
          else if (bq == 1)
          {
              b++;
          }
          else if (bq == 2)
          {
              c++;
          }
          else if (bq == 3)
          {
              d++;
          }
          else if (bq == 4)
          {
              e++;
          }       
      }
      
      System.out.println("The Random Robot hits quadrant 0 (" + l + " times), quadrant 1 (" + m + " times), quadrant 2 (" + n + " times), quadrant 3 ("+ o + " times), and quadrant 4 (" + p + " times).");
      System.out.println(lb);
      System.out.println("The Biased Robot hits quadrant 0 (" + a + " times), quadrant 1 (" + b + " times), quadrant 2 (" + c + " times), quadrant 3 ("+ d + " times), and quadrant 4 (" + e + " times).");
    }    
}