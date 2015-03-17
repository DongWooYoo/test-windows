/**
 The RainfallDriver uses the Rainfall class and stores all the methods in the Rainfall class.
 CSI 310 - Programming Lab 1
 Instructor Dr. Hurd
 @author Dong Woo Yoo
 @since 01-31-15
 */

public class RainFallDriver
{
  
  public static void main(String[] args)
  {
    RainFall rainfall1 = new RainFall();
    
    System.out.println("The total rainfall for the year is: " + rainfall1.totalRainfall() + " inches" );
    System.out.println("The average rainfall for the year is: " + rainfall1.averageRainfall() + " inches");
    System.out.println(rainfall1.mostRainfall() + "had the most rainfall.");
    System.out.println(rainfall1.leastRainfall() + "had the least rainfall.");
  }
}