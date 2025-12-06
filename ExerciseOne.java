// TODO: Create an interface called Machine with one method: String start()

interface Machine{
    void start();
}


// TODO: Create an abstract class called Appliance that:
// - Implements Machine interface

abstract class Appliance implements Machine{
   public abstract void start();
} 
// TODO: Create a class Fan that:
// - Extends Appliance

class Fan extends Appliance{
   public void start(){
        System.out.println("Start the Fan");
    } 
}


// TODO: Create a class WashingMachine that:
// - Extends Appliance
class WashingMachine extends Appliance{
    
   public void start(){
        System.out.println("Start the WashingMachine");
    }
    
}

public class ExerciseOne {
    public static void main(String[] args) {
        // TODO: Create objects of Fan and WashingMachine using interface references
        // TODO: Print the result of start() for each object
        
        Fan obj = new Fan();
        obj.start();
        
        WashingMachine obj2= new WashingMachine();
        obj2.start();
        
    }
}