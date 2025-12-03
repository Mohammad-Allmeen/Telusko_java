
class Car{
private double speed;
private String color;

/*
 public void set_Speed(double speed){ // here the variable speed and s are different however what if i keep the s variable as speed then the local variable and the instance/global variable will remain same then it creates a confusion in assigning the value
    speed=speed;  // this will print 0.0 
}
 */

// this keyword
// to differentiate the instance variable and local variable this keyword is used 
// this keyword refers to the current object which calls the method here it is obj
// obj refers to the Car class object thus it refers and signals it to the instance variable of the class

public void set_Speed(double speed){ 
      this.speed=speed;  // now it will assign to the instance/global variable
}
public double get_speed(){
    return speed;
}

public String get_color(){
    return color;
}
}


public class this_keyword {
    public static void main(String [] args){
    Car obj= new Car();
    obj.set_Speed(200);
    System.out.println(obj.get_speed());
    }
}
