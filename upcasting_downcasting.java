class A{
public void show1(){
System.out.println("In show1 ");
}
}

class B extends A{
    public void show2(){
        System.out.println("In show 2");
    }
}



public class upcasting_downcasting {
    public static void main(String [] args){

        //type casting in variable

        double pie= 3.21;
        int p= (int) pie;  //downcasting the variable


        //typecasting of the object

        //below the reference is on super class and object is of derived class means you cannot access the derived class methods 

        A obj= (A)new B(); // this upcasting implicitely and automatically happens in the program as you can access all the method of the super class which is the upper class upcasting

        
        // However if you need to access the the lower class method that is the derived class method which you cannot access by above method because the reference is of A class
        // Then you need to perform downcasting which is done manually and specifically

        B obj1= (B) obj;  // this is call downcasting, now using this new obj1 you can call the methods of the derived class
        
    }
}
