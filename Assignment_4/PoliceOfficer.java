package OOP_Assign04;

/**
 *
 * @author soibamb
 */
/*
Using this class is Professor Soibam's code to implement PoliceOfficer's methods in
the ParkingGarage class
*/
/*
   The PoliceOfficer class stores data about a police officer
   for the Parking Ticket Simulator programming challenge.
*/


public class PoliceOfficer
{
   private String name;          // Officer's name
   private String badgeNumber;   // Badge number

   /**
      Constructor
      @param n The officer's name.
      @param bn The officer's badge number.
   */

   public PoliceOfficer(String n, String bn)
   {
      name = n;
      badgeNumber = bn;
   }

   /**
      Copy constructor
      @param officer2 The PoliceOfficer object to copy.
   */

   public PoliceOfficer(PoliceOfficer officer2)
   {
      name = officer2.name;
      badgeNumber = officer2.badgeNumber;
   }

   /**
      setName method
      @param n The officer's name.
   */

   public void setName(String n)
   {
      name = n;
   }

   /**
      setBadgeNumber method
      @param n The officer's badge number.
   */

   public void setBadgeNumber(String b)
   {
      badgeNumber = b;
   }

   /**
      getName method
      @return The officer's name.
   */

   public String getName()
   {
      return name;
   }

   /**
      getBadgeNumber method
      @return The officer's badge number
   */

   public String getBadgeNumber()
   {
      return badgeNumber;
   }

   /**
      The patrol method looks at the number of
      minutes a car has been parked and the number
      of minutes purchased. If the minutes parked
      is greater than the minutes purchased, a
      ParkingTicket object is returned. Otherwise
      the method returns null.
      @param car A ParkedCar object.
      @param meter A ParkingMeter object.
      @return A ParkingTicket object if a violation
              occurred, null otherwise.
   */

   public ParkingTicket patrol(ParkedCar car,
                               ParkingMeter meter)
   {
      ParkingTicket ticket = null; // To reference the ticket
      int illegal_min = 0;

      // Get the minutes parked over the amount purchased.
      
      illegal_min = meter.getMinutesPurchased() - car.getMinutesParked();      

      // Determine whether the car is illegally parked.
     
      if (illegal_min > 0)
      {
          System.out.println("This car is parked illegaly for " + illegal_min + " minutes.");
          ticket = new ParkingTicket (car, this, illegal_min);
      }
      else
      {System.out.print("This car is not parked  illegally");}

      // Return the ticket, if any.     
      return ticket;
   }

   /**
      toString method
      @return A string stating the officer's name
              and badge number.
   */

   public String toString()
   {
      // Build a state string.
      String str = String.format("Name: %s\n" +
                                 "BadgeNumber: %s\n",
                                 name, badgeNumber);

      // Return the String.
      return str;
   }
}
