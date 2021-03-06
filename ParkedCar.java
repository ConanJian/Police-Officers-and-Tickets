public class ParkedCar
{
   private String make;
   private String model;
   private String color;
   private String licenseNumber;
   private int minutesParked;
   public ParkedCar(String mk, String mod, String col, String lic, int min)
   {
      make = mk;
      model = mod;
      color = col;
      licenseNumber = lic;
      minutesParked = min;
   }
   public ParkedCar(ParkedCar car2)
   {
      this(car2.make, car2.model, car2.color, car2.licenseNumber, car2.minutesParked);
   }
   public void setMake(String mk)
   {
      make = mk;
   }
   public void setModel(String mod)
   {
      model = mod;
   }
   public void setColor(String col)
   {
      color = col;
   }
   public void setLicenseNumber(String lic)
   {
      licenseNumber = lic;
   }
   public void setMinutesParked(int min)
   {
      minutesParked = min;
   }
   public String getMake()
   {
      return make;
   }
   public String getModel()
   {
      return model;
   }
   public String getColor()
   {
      return color;
   }
   public String getLicenseNumber()
   {
      return licenseNumber;
   }
   public int getMinutesParked()
   {
      return minutesParked;
   }
   public String toString()
   {
      String carData = String.format("Car Data--\nMake: %s\nModel: %s\nColor: %s\nLicense Number: %s\nMinutes Parked: %d\n", make
                                     , model, color, licenseNumber, minutesParked);
      return carData;
   }
}
