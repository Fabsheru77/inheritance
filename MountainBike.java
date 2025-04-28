
////////////////FARIS
package util;
import java.util.concurrent.ThreadLocalRandom;

public class MountainBike extends Bicycle{
  public  int trailSpeed;

  public MountainBike (String make, String model, int streetSpeed, int trailSpeed){

    super(make, model, streetSpeed);
    this.trailSpeed = trailSpeed;
    }//end constructor 
  @Override public double race(double miles, String terrain){
    int speed;
    if(terrain == "trail"){ //trail speed
      speed = ThreadLocalRandom.current().nextInt(1, this.trailSpeed + 1);
  }else{ //streetSpeed
    speed = ThreadLocalRandom.current().nextInt(1, this.streetSpeed + 1);

  } // end else
  return miles/speed;
  } //end race

  @Override public String toString(){
  String myReturn = super.toString();
    myReturn += "trailSpeed: " + this.trailSpeed; 
    return myReturn;

  } // end toString()
} //end MountainBike class
