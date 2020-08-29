package OOP_Assign04;
/*
This class is made by Andrew Samuel for Assignment 4 of Professor Soibam's
CS 3304 class. [3/30/20]
*/
/*
CS 3300 - M [1:00-2:15]-CRN: 25965
*/
/*
This class simulates a Parking Garage. This class implements methods from :
ParkedCar, ParkingMeter, ParkingTicket, and PoliceOfficer.
*/
public class ParkingGarage {
    
    private int TOTAL_SPOTS = 20; //Maximum spots in garage
    public double total_fine;
    public int total_finedcars;
    
    ParkedCar[] Cars;
    ParkingMeter[] Meters;
    ParkingTicket[] Tix;
    PoliceOfficer Officer;
    
    //Default Constructor initiating all to null
    ParkingGarage()
    {
        Cars = null;
        Meters = null;
        Tix = null;
        Officer = null;
        
        total_fine = 0;
        total_finedcars = 0;
    }
    
    //Copy constuctor to initate object values
    ParkingGarage(ParkedCar[] N_Cars, ParkingMeter[] N_Meters, PoliceOfficer N_Officer)
    {
       for (int a = 0; a <= TOTAL_SPOTS; a++) 
       {
           Cars[a] = new ParkedCar (N_Cars[a]);
           //Uses ParkedCar copy constructor
       }
       
       for (int b = 0; b <= TOTAL_SPOTS; b++)
       {
           Meters[b] = N_Meters[b];
           //Copies ParkingMeter[] to argument passed
       }
       
       Officer = new PoliceOfficer (N_Officer);
       //Uses PoliceOfficer copy constructor
    }
    
    //Function to calculate total fine and total amount of illegal cars
    void Calc_Fine()
    {
        int ic = 0;
       for (int i = 0; i <= TOTAL_SPOTS; i++)
       {
           if (Tix[i].fine > 0)
           {
                //calculates total fine if the fine is above 0.
               total_fine = (total_fine + Tix[i].fine);
               ic++; // increments total amount of illegal cars               
           }
       }
       total_finedcars = ic; // assigns total # of illegal cars
    }
    
    //get function for ParkedCar object
    ParkedCar[] getCars()
    {
        ParkedCar[] C_arr = new ParkedCar[TOTAL_SPOTS]; //copy array to display(return)
        
        for (int i = 0; i <= TOTAL_SPOTS; i++)
        {
            Cars[i] = C_arr[i];
            //Copies Cars to a seperate array to display
        }
        
        return C_arr;
    }
    
    //get function for ParkingMeter object
    ParkingMeter[] getMeters()
    {
        ParkingMeter[] M_arr = new ParkingMeter[TOTAL_SPOTS]; //copy array to display(return)
        
        for (int i = 0; i <= TOTAL_SPOTS; i++)
        {
            Meters[i] = M_arr[i];
            // Copies Meters to a seperate array to display
        }
        
        return M_arr;
    }
    
    //get function for ParkingTicket object
    ParkingTicket[] getTix()
    {
        ParkingTicket[] T_arr = new ParkingTicket[TOTAL_SPOTS]; //copy array to display(return)
        
        for (int i = 0; i <= TOTAL_SPOTS; i++)
        {
            Tix[i] = T_arr[i];
            //Copies Tix to a seperate array to display
        }
        
        return T_arr;
    }
    
    //setting ParkedCar[] to passed argument
    void setCars (ParkedCar[] C)
    {
        for (int i = 0; i <= TOTAL_SPOTS; i++)
        {
            Cars[i] = new ParkedCar (C[i]);
            //Uses ParkedCar copy constructor
        }
    }
    
    //setting ParkingMeter[] to passed argument
    void setMeter (ParkingMeter[] M)
    {
        for (int i = 0; i <= TOTAL_SPOTS; i++)
        {
            Meters[i] = M[i];
            //Copies ParkingMeter[] to argument passed
        }
    }
    
    //setting ParkingTicket[] to passed argument
    void setTix (ParkingTicket[] T)
    {
        for (int i = 0; i <= TOTAL_SPOTS; i++)
        {
            Tix[i] = new ParkingTicket (T[i]);
            //Uses Parkingticket copy constructor
        }
    }
}
