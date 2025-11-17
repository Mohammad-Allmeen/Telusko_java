// Static variable belongs to the class and remains same which is shared by all the object of the class
// Making the variable static saves the memory as only one copy is created which is shared by all the object of the class


class Mobile {
    String brand;
    int price;
    static String name; // when i assign this variable as static it will becomes same for all the object of the class and this will be accesed using the class name 
   
    static{ // in this staic block you can initialize the static variable which is called only once no matter how many the object is created
    name ="Iphone";
    System.out.println("In static block");
    }

    public Mobile(){ //constructor
      brand="";
      price=1500;
      //name= "Iphone"; // you can innitialize the variable using constructor both static and non static variable however every time the object is created the constructor is called 
      //therefore if i want the name variable which is static should be initialized only once so i can use the static method
    }
    
    public void show(){
        System.out.println("Brand: " +brand + " Price: " +price+ "Name: "+name);
    }

    public static void show1(){
        System.out.println(" This is a static method");

        //ERROR

        // System.out.println("Brand: " +brand + " Price: " +price+ "Name: "+name); // this gives error as brand and price is non static varibale and cannot be use inside the static method

        // because non-static method are different for different object if used inside the static method it becomes confusing which object you are refering to

    }
}



public class Static_variable {
    public static void main(String [] args) throws ClassNotFoundException{ // a reason main method is static because if it becomes non-static then an object creation is required but program has not yet started therefore there cannot be an object creation
    // therefore the main method is static to avoid its object creation


        Mobile.name= "Smartphone";
        Mobile.show1();

        Mobile ob1= new Mobile();
       ob1.brand=" Apple";
       ob1.price= 1700;
       ob1.name= "phone"; 
       // when i am accessing it using the object it is modifying the same variable that is stored in the heap memory 
       // and this is difference between static and final, 
       // location remains same but can be modified but for final the data and address remains same
       ob1.show();

       Mobile ob2= new Mobile();
       ob2.brand="Samsung";
       ob2.price= 1500;
       ob2.name= "Smartphone";
       ob2.show();

       /*In java when the object is created there are two process that takes place 
       1. First The class gets loaded and it happens only onces that is why it first calls the static block 
       2. Then it creates the object and if constructor is present it is called

       however if i do not create the object it will neither call the static block not it loads the class
    
       for that there is method of Class class which is known as forName method which loads the class
       */

       Class.forName("Mobile");

    }
}


