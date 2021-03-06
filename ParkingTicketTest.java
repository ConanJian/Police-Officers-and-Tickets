public class ParkingTicketTest //I didn't write this test case, my teacher just gave me this code.
{
   public static void main(String[] args)
   {
      System.out.println("\n... set minutes purchased to 60, and");
      System.out.println("    parked for 125 minutes...");
      // Create a ParkedCar object.
      // The car was parked for 125 minutes.
      ParkedCar car = new ParkedCar("Volkswagen", "2012", "Red",
                                    "3RHZ147", 125);
      
      // Create a ParkingMeter object. 60 minutes were purchased.
      ParkingMeter meter = new ParkingMeter(60);
      
      // Create a PoliceOfficer object.
      PoliceOfficer officer = new PoliceOfficer("Joe Friday", "4788");
      
      // Let the officer patrol.
      ParkingTicket ticket = officer.patrol(car, meter);
      
      // Did the officer issue a ticket?
      if (ticket != null)
         System.out.println(ticket);
      else
         System.out.println("No crimes committed!\n");

      // Test case 2
      // Change minutes parked to 60
      System.out.println("... change minutes parked to 60");
      car.setMinutesParked(60);
      ticket = officer.patrol(car, meter);
      if (ticket != null)
         System.out.println(ticket);
      else
         System.out.println("No crimes committed!\n");

      // Test case 3
      // Change minutes parked to 61
      System.out.println("... change minutes parked to 61");
      car.setMinutesParked(61);
      ticket = officer.patrol(car, meter);
      if (ticket != null)
         System.out.println(ticket);
      else
         System.out.println("No crimes committed!\n");

      // Test case 4
      // Change car model to 2018
      System.out.println("... change car model to 2018");
      car.setModel("2018");
      ticket = officer.patrol(car, meter);
      if (ticket != null)
         System.out.println(ticket);
      else
         System.out.println("No crimes committed!\n");

      // Test case 5
      // Change minutes purchased to 70
      System.out.println("... change minutes purchased to 70");
      meter.setMinutesPurchased(70);
      ticket = officer.patrol(car, meter);
      if (ticket != null)
         System.out.println(ticket);
      else
         System.out.println("No crimes committed\n");
   }
}
