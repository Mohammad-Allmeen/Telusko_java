/* 

Polymorphism is the concept of OOPS that explains many behaviour and forms of method
// Poly means many and morph means forms
// There are two types of polymorphism 

1. Compile type polymorphism also called Early Binding
- Method overloading is the concept of Compile Time Poly. where which method will be executed will be decided at compile time 

2. Run Time polymorphism also called Late Binding
- Method overriding is the concept of Run Time Poly. , where which method will be executed is decided at Run time 


*/
package OOPs;

class Computer {
    void show(){
        System.out.println("Computer super/base class");
    }
     
}

class Laptop extends Computer{
    void show(){
        System.out.println("Laptop sub/derived class");
    }

    public void portable(){
        System.out.println("Laptop is portable");
    }
}

class Mobile extends Computer
{
    void show(){
        System.out.println("Mobile derived class");
    }
}

public class Polymorphism {
    public static void main(String [] args){
     
        Computer ob= new Computer(); // in this we create the reference of base class and object of the base class
        ob.show();// base class method will be printed


      
        // Reference of the super class and the object of the derived class
        Computer ob1= new Laptop();// however we can create the reference of the base/super class and object of the derived class
        // However has one drawback that you cannot access the method which is only present in the derived i.e Laptop class
   
       //  ob1.portable(); // this will give error as the method is only present in the derived that is the Laptop class


        ob= new Laptop(); // we can use the same object make it the object of different class, in memory the the same object which is present in the stack will be assinged/linked to new class object created in the heap 
        ob.show();  // derived class/Laptop class method will be printed

        ob= new Mobile();
        ob.show();// now the method of the derived class will be printed 


        //hence the same object which is "ob" is behaving differently with different class which is the concept of Polumorphism
        //Thats why its called Run-Time Polymorphism and Dynamic method dispatch becuase its dynamic which method will be executed is decided at run time 

    }
}
