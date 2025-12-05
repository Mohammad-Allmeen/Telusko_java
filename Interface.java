// Interface is a concept which is used to implement the fuctionality of the Data Abstraction
// NOTE- Abstract is class and Interface is not a class, it is a reference type
// By Default every method in the interface is "public abstract" 
// the concept of interface is basically to show you the design by just declare the method but it is the job of you meaning the class to implement it
// Just like if you want to reach a location i will show you the path however it is your job to walk 
//Interface is a concept which is used to implement the concept Multiple inheritance in Java

interface Super{

    int area=4500; //By default every varibale in the interface is final and static so you need to define them and they wont be modified
    String name= "India";


   public abstract void drive(); 
   void fly(); // by default "public abstract" is added before therefore you do not need to write it will automatically work
}

// you can have multiple interface and a class can implement multiple interfaces
interface SuperSecond{
void brake();
}

class Derived implements Super,SuperSecond{
    public void drive(){
        System.out.println("Drive the car"); 
    }
    public void fly(){
        System.out.println("Fly the car");
    }

    public void brake(){
        System.out.println("Applying brake");
    }
}


public class Interface {
    public static void main(String [] args){
     Super obj= new Derived();
     obj.drive();
     obj.fly();

     System.out.println(Super.area); // as the varibale is final and static you can directly access using the class name
    }
}
