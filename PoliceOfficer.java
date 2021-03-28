public class PoliceOfficer
{
   private String name;
   private String badgeNumber;
   public PoliceOfficer(String n, String bn)
   {
      name = n;
      badgeNumber = bn;
   }
   public PoliceOfficer(PoliceOfficer officer2)
   {
      this(officer2.name, officer2.badgeNumber);
   }
   public void setName(String n)
   {
      name = n;
   }
   public void setBadgeNumber(String bn)
   {
      badgeNumber = bn;
   }
   public String getName()
   {
      return name;
   }
   public String getBadgeNumber()
   {
      return badgeNumber;
   }
   public ParkingTicket patrol(ParkedCar car, ParkingMeter meter)
   {
      if(car.getMinutesParked() > meter.getMinutesPurchased())
      {
         int minutesOverParked = car.getMinutesParked() - meter.getMinutesPurchased();
         return new ParkingTicket(car, this, minutesOverParked);
      }
      else
      {
         return null;
      }
   }
   public String toString()
   {
      String officerData = String.format("Officer Data--\nName: %s\nBadgeNumber: %s\n", name, badgeNumber);
      return officerData;
   }
}
