public class ParkingMeter
{
   private int minutesPurchased;
   public ParkingMeter(int minutesPurchased)
   {
      this.minutesPurchased = minutesPurchased;
   }
   public void setMinutesPurchased(int minutesPurchased)
   {
      this.minutesPurchased = minutesPurchased;
   }
   public int getMinutesPurchased()
   {
      return minutesPurchased;
   }
   public String toString()
   {
      return "Minutes Purchased: " + minutesPurchased;
   }
}
