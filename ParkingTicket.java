public class ParkingTicket
{
   private ParkedCar car;
   private PoliceOfficer officer;
   private int minutes;
   private double fine;
   public static double BASE_FINE = 25.0;
   public static double HOURLY_FINE = 10.0;
   public ParkingTicket(ParkedCar aCar, PoliceOfficer anOfficer, int min)
   {
      car = new ParkedCar(aCar);
      officer = new PoliceOfficer(anOfficer);
      minutes = min;
      calculateFine();
   }
   private void calculateFine()
   {
      if(minutes/60.0 <= 1)
      {
         fine = BASE_FINE;
      }
      else
      {
         double amtOfHours = minutes/60.0-1;
         fine = BASE_FINE + HOURLY_FINE*(int)amtOfHours;
         if(amtOfHours-(int)amtOfHours > 0)
            fine += HOURLY_FINE;
      }
   }
   public void setCar(ParkedCar c)
   {
      car = new ParkedCar(c);
   }
   public void setOfficer(PoliceOfficer o)
   {
      officer = new PoliceOfficer(o);
   }
   public void setMinutes(int m)
   {
      minutes = m;
      calculateFine(); // fine will always be updated correctly
   }
   public ParkedCar getCar()
   {
      return new ParkedCar(car);
   }
   public PoliceOfficer getOfficer()
   {
      return new PoliceOfficer(officer);
   }
   public double getFine()
   {
      return fine;
   }
   public String toString()
   {
      String str = String.format("%s%sMinutes Illegally Parked-- %d\nFine-- $%.2f\n", car, officer, minutes, fine);
      return str;
   }
}
