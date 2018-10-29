/**
* A refrigerator, a cabinet in which food and drink are kept cool by means of evaporator coils. Can also be used to protect Indiana Jones from a nuclear explosion?
* @author Justin Riley
* @version 1.0
* @since October 14, 2018
*/
public class Refrigerator
{
  private boolean isPluggedIn, isDoorClosed, isLightOn;
  private double age, currentTemp;
  private int numberOfEggs;
  private String exteriorColor, smell;

  /**
  * Create a refrigerator with a given age, numberOfEggs, exteriorColor, and smell that is already plugged in and running.
  * @param _age A double with the current age of the fridge in years.
  * @param _numberOfEggs An int with the amount of eggs in the fridge.
  * @param _exteriorColor A String that describes the exterior of the fridge.
  * @param _smell A String that describes the smell of the fridge.
  */
  public Refrigerator(double _age, int _numberOfEggs, String _exteriorColor, String _smell){
    isPluggedIn = true;
    isDoorClosed = true;
    isLightOn = false;
    this.age = _age;
    currentTemp = 35.0; // According to lifehacker.com, the ideal refrigerator temperature is 35° F
    numberOfEggs = _numberOfEggs;
    exteriorColor = _exteriorColor;
    smell = _smell;
  }
  
  /**
  * Creates a new default refrigerator with no parameters
  */
  public Refrigerator(){
    isPluggedIn = true;
    isDoorClosed = true;
    isLightOn = false;
    this.age = 0;
    currentTemp = 35.0; // According to lifehacker.com, the ideal refrigerator temperature is 35° F
    numberOfEggs = 0;
    exteriorColor = "white";
    smell = "good";
  }
 
  public Refrigerator(){
    isPluggedIn = true;
    isDoorClosed = true;
    isLightOn = false;
    this.age = 0;
    currentTemp = 35.0;
    numberOfEggs = 0;
    exteriorColor = "silver";
    smell = "bad";
  }
  /**
  * Change the temperature of the refrigerator
  * @param _temp A double to set the temperature to
  */
  public void changeTemp(_temp){
    currentTemp = _temp;
  }
  
  /**
  * Get the current temperature of the refrigerator
  * @return currentTemp A double for the current temperature of the fridge
  */
  public double getTemp(){
    return currentTemp;
  }

  public void changeSmell(_smell1){
    smell = _smell1;
  }


  public String getSmell(){
    return smell;
  }
}
