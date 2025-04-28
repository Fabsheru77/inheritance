
//////////////////FARIS
package util;
import java.util.concurrent.ThreadLocalRandom;
public class Bicycle{
  public String make;
  public String model;
  public  int streetSpeed;
  
public Bicycle (String make, String model, int streetSpeed){
  this.make = make;
  this.model = model;
  this.streetSpeed = streetSpeed;
  }//end constructor 

  public double race(double miles, String terrain){
    if(terrain != "street") {// Illegal terrain, return -1
      return -1d;
    }// end if
    
    int speed = (int) this.streetSpeed;
    speed = ThreadLocalRandom.current().nextInt(0, speed + 1);
  
    return miles/speed;
  }// end race

public String getClassName() {
  // We are deriving the class name and passing it on 
  
  String str = String.valueOf(this.getClass());
  str = str.substring(str.lastIndexOf(".") + 1);
  //sb.append("class: ").append(str).append(" ");
  return str;
}// end getclassname

public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("make: ").append(this.make).append(" ");
      sb.append("model: ").append(this.model).append(" ");
      sb.append("streetSpeed: ").append(this.streetSpeed);
        return sb.toString();

    }// end toString()



  /*
    sb.append("make: ").append(this.make).append(" ");
    sb.append("model: ").append(this.model).append(" ");
    sb.append("streetSpeed: ").append(this.streetSpeed);
      return sb.toString

  
  */
}//end Bicycle class
