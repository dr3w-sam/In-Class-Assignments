
package oop_assign02;

import java.util.Random;

public class BiasedRobot 
{
    
    private Random ranGen = new Random();
    
   
    String[] direction = {"North", "East", "East", "East", "South", "West"};
    String bd;
    
    int brobot_loc_x;
    int brobot_loc_y;

    int final_blocx;
    int final_blocy;
    
    BiasedRobot()
    {
        brobot_loc_x = 0;
        brobot_loc_y = 0;   
        
        int b_index = ranGen.nextInt(5);
        //bd = direction[b_index];
        
        switch(b_index)
        {
            case 0:
                bd = "North";
                break;
            case 1:
                bd = "East";
                break;
            case 2:
                bd = "East";
                break;
            case 3:
                bd = "East";
                break;
            case 4:
                bd = "South";
                break;
            case 5:
                bd = "West";
                break;
        }
    }
    
    BiasedRobot( int x, int y)
    {
        brobot_loc_x = x;
        brobot_loc_y = y;
        
       int b_index = ranGen.nextInt(5);
       bd = direction[b_index]; 
       
       switch(b_index)
        {
            case 0:
                bd = "North";
                break;
            case 1:
                bd = "East";
                break;
            case 2:
                bd = "East";
                break;
            case 3:
                bd = "East";
                break;
            case 4:
                bd = "South";
                break;
            case 5:
                bd = "West";
                break;
        }
    }
    
    int quadrant(int a, int b)
    {
        int q = 0;
        
        if (a == 0 || b == 0)
        {
            q = 0;
        }
        
        if (a > 0 && b > 0)
        {
            q = 1;
        }
        
        if (a < 0 && b > 0)
        {
            q = 2;
        }
        
        if (a < 0 && b < 0)
        {
            q = 3;
        }
        
        if (a > 0 && b < 0)
        {
            q = 4;
        }
        return q;
    }
    
    void move()
    {
       
        int new_x = 0;
        int new_y = 0;
        
        String b = bd;
                 
        if (b.equals("North"))
        { 
            new_x = ranGen.nextInt(1000-(-1000)+1)+(-1000);
            new_y = ranGen.nextInt(1000);
        }
        else if (b.equals("South"))
        {
            new_x = ranGen.nextInt(1000-(-1000)+1)+(-1000);
            new_y = ranGen.nextInt(0-(-1000)+1)+0;
        }
        else if (b.equals("East"))
        {
            new_x = ranGen.nextInt(1000);
            new_y = ranGen.nextInt(1000-(-1000)+1)+(-1000);
        }
        else if (b.equals("West"))
        {
            new_x = ranGen.nextInt(0-(-1000)+1)+0;
            new_y = ranGen.nextInt(1000-(-1000)+1)+(-1000);            
        }
        final_blocx = new_x;
        final_blocy = new_y;
    }
    
    int simulate (int step_num)
    {        
        int qb;
        for (int i = 0; i <= step_num;i++)
        {
            move();
        }
        qb = quadrant(final_blocx, final_blocy);
        
        
        //System.out.println("The final location is " + final_blocx + "," + final_blocy + " And it is in quadrant " + qb);
        return qb;
    }
}
