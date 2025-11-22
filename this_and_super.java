// super(); keyword calls the constructor of the parent class
// By default every constructor has the super(); already present whethere you mention it or not
// and this keyword calls the default constructor of the parent class


// every class in java extends the object class  


class A extends Object {

    public A()
{
System.out.println("In A default");
}

  public A(int n){

        System.out.println("In A parameterized");
    }
}

class B extends A
{
    public B(){
        super(5); // this will execte the default of the derived class and parametrized cons. of the base class 
        System.out.println("IN B default");
    }

    public B(int n){

      this(); // this() keyword is used to executes the contructor of the same class
      System.out.println("In B parameterized");
    }
}



public class this_and_super {
    public static void main(String[] args){
        // B obj= new B();  // if you want to execute the default cons. of the derived class and param. cons. of the base class then 
        //   create the object of the derived class without passing the value and use super and pass the value in super in the defualt cons. of the derived class
        B obj1= new B(5);

    }

}
