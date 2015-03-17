import java.util.Scanner;

/**
 Purpose :The RainFall class stores the total rainfall for 12 months into an array of doubles
 with methods to access the data stored in the array
 CSI 310 - Programming Lab 1
 Instructor Dr. Hurd
 @author Dong Woo Yoo
 @since 01-31-15
 */
public class RainFall
{
  private double[] yrRainfall = new double[12];
  
  
  public RainFall()
  {
    Scanner keyboard = new Scanner(System.in);
    String[] strMonths = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    
    System.out.println("You will be prompted for the amount of rainfall for each month...");
    

    for(int index = 0; index < yrRainfall.length; index++)
    {
      yrRainfall[index] = -1;
      while(yrRainfall[index] < 0)
      {
        System.out.println("Please enter the amount of rainfall for " + strMonths[index] + ":" );
        yrRainfall[index] = keyboard.nextDouble();
      }
    } 
  }
 
  /**
   The totalRainfall method collects a sum of all the elements of the yrRainfall array
   @return returns the sum as a double
   */
  public double totalRainfall()
  {
    double totalRain = 0.0;
    
    for(int index = 0; index < yrRainfall.length; index++)
    {
      totalRain += yrRainfall[index];
    }
    return totalRain;
  }
  
  /**
  The averageRainfall method calculates the average rainfall for the year using the totalRainfall method
  @return returns the average rainfall as a double
  */
  public double averageRainfall()
  {
   double averageRain = 0.0;
   averageRain = (this.totalRainfall()/12);
   
   return averageRain;
  }
  
  /**
  The mostRainfall method finds the month that has the most rainfall, if there are more than one month it mentions the first by name and that there may be other months
  @return returns a string containing the name of the month/months with the least rainfall
  */
  public String mostRainfall()
  {
    String[] strMonths = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    int mostRainMonth = 0;
    double mostRain = 0.0;
    String output = "";
    
    for(int index = 0; index < yrRainfall.length; index++)
    {
      if(yrRainfall[index] > mostRain)
      {
        mostRain = yrRainfall[index];
      }
    }
     for(int index = 0; index < yrRainfall. length; index++)
    {
      if (yrRainfall[index] == mostRain)
      {
        output += (strMonths[index] + " ");
      }
    }
    return output;
  }
  
  /**
  The leastRainfall method finds the month that has the least rainfall, if there are less than one month it mentions the first by name and that there may be other months
  @return returns a string containing the name of the month/months with the least rainfall
  */
  public String leastRainfall()
  {
    String[] strMonths = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    int leastRainMonth = 0;
    double leastRain = yrRainfall[0];
    String output = "";
    
    for(int index = 0; index < yrRainfall.length; index++)
    {
      if(yrRainfall[index] < leastRain)
      {
        leastRain = yrRainfall[index];
      }
    }
    for(int index = 0; index < yrRainfall. length; index++)
    {
      if (yrRainfall[index] == leastRain)
      {
        output += (strMonths[index] + " ");
      }
    }
    return output;
  }  
}


