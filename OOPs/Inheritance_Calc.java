
package OOPs;

// Calc is the Super Class/Base Class/Parent class and AdvClass is the derived class
class Calci{

    public int add(int a, int b){
     return a+b;
    }

    public int  sub(int a, int b){
        return a-b;
    }

}

class AdvCalci extends Calci{
public int multi(int a, int b){
    return a*b;
}

public int div(int a, int b){
    return a/b;
}
}


public class Inheritance_Calc {
    public static void main(String [] args){
    
    // object is created of the derived class 
    AdvCalci obj= new AdvCalci(); // "IS-A" relationshiop for example XUV is a Car means XUV inherits all the prop. of the car similarly Laptop is Computer as laptop inherits all the properties of the computer 
    
    int addRes= obj.add(15, 5);
    int subRes= obj.sub(12,5);
    int multiRes= obj.multi(10, 5);
    int divRes= obj.div(10, 5);

    System.out.println("Addition: " +addRes +", Subtraction: "+ subRes+ ", Multiplication: "+ multiRes + ", Divison: "+divRes );

    }
}
