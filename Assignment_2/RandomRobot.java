
package oop_assign02;

import java.util.Random;

public class RandomRobot 
{
    
    private Random ranGen = new Random();

    String[] direction = {"North", "East", "South", "West"};
    String rd;

    int rrobot_loc_x;
    int rrobot_loc_y;
    
    int final_rlocx;
    int final_rlocy;
        
    RandomRobot()
    {
        rrobot_loc_x = 0;
        rrobot_loc_y = 0;
        
        int r_index = ranGen.nextInt(3); 
               
        
        switch(r_index)
        {
            case 0:
                rd = "North";
                break;
            case 1:
                rd = "East";
                break;
            case 2:
                rd = "South";
                break;
            case 3:
                rd = "West";
                break;
        }
        
    }

    
    
    RandomRobot( int x, int y)
    {
        rrobot_loc_x = x;
        rrobot_loc_y = y;
        
        int r_index = ranGen.nextInt(3); 
        
        
        switch(r_index)
        {
            case 0:
                rd = "North";
                break;
            case 1:
                rd = "East";
                break;
            case 2:
                rd = "South";
                break;
            case 3:
                rd = "West";
                break;
        } rd = direction[r_index];
    }
    
    public int quadrant(int a, int b)
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
    
    public void move(String rd)
    {
        int new_x = 0;
        int new_y = 0;
       
        String a = rd;
        
        if (a.equals("North"))
        { 
            new_x = ranGen.nextInt(1000-(-1000)+1)+(-1000);
            new_y = ranGen.nextInt(1000);
        }
        else if (a.equals("South"))
        {
            new_x = ranGen.nextInt(1000-(-1000)+1)+(-1000);
            new_y = ranGen.nextInt(0-(-1000)+1)+0;
        }
        else if (a.equals("East"))
        {
            new_x = ranGen.nextInt(1000);
            new_y = ranGen.nextInt(1000-(-1000)+1)+(-1000);
        }
        else if (a.equals("West"))
        {
            new_x = ranGen.nextInt(0-(-1000)+1)+0;
            new_y = ranGen.nextInt(1000-(-1000)+1)+(-1000);            
        }
        final_rlocx = new_x;
        final_rlocy = new_y;
    }
    
    public int simulate (int step_num)
    {
        int qr;
        int a;
        int b;
        int c;
        int d;
        
        for (int i = 0; i <= step_num;i++)
        {
            move(rd);
        }
        qr = quadrant(final_rlocx, final_rlocy);
        
        //System.out.println("The final location is " + final_rlocx + "," + final_rlocy + " And it is in quadrant " + qr);
        return qr;
    }
}
