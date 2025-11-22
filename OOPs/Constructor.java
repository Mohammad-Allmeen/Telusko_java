// Constructor is a method same as class name and is used to assign the value at the time of creating the object 
// By default when you create a object of the class behing the scene a default constructor is created 


class Car{
private double speed;
private String color;


public Car(){ // default/non parameterized constructor

}

public Car(String c, int s) // Parametrized constructor
{
    speed=s;
    color=c;
}

public void set_Speed(double speed){ 
      this.speed=speed; 
}
public double get_speed(){
    return speed;
}

public String get_color(){
    return color;
}
}


public class Constructor {
    public static void main(String [] args){

    new Car(); // this is called "Anonymous object" it is created in the heap however it will have no reference in the stack, the drawback is that you cannot reuse it as it has no reference
    
    Car obj= new Car();
    Car obj1= new Car("White", 200); // this will be related to the parameterized constructor
    
    System.out.println(obj.get_color()+ " : "+ obj.get_speed());
    
    }
}
