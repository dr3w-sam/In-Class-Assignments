package OOP_Assign04;
/**
 *
 * @author soibamb
 */
/*
Using this class from Professor Soibam's code to implement ParkingMeter's methods in
the ParkingGarage class
*/
/*
   The ParkingMeter class stores data about a parking meter
   for the Parking Ticket Simulator programming challenge.
*/


public class ParkingMeter
{
   private int minutesPurchased; // Minutes purchased

   /**
      Constructor
      @param m The number of minutes purchased.
   */

   public ParkingMeter(int m)
   {
      minutesPurchased = m;
   }

   /**
      setMinutesPurchased method
      @param m The number of minutes purchased.
   */

   public void setMinutesPurchased(int m)
   {
      minutesPurchased = m;
   }

   /**
      getMinutesPurchased method
      @return The number of minutes purchased.
   */

   public int getMinutesPurchased()
   {
      return minutesPurchased;
   }
}