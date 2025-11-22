//Method overriding is the concept where the derived/child class method overrides the method of the base class
// In method overriding the method name and numbers of parameters are same
// Means when the method is called it first gives preference to the method of the derived class

package OOPs;

class Calc{
    public int add(int n1, int n2){
        return n1+n2;
}
}

class AdvCalc extends Calc{
    public int add(int n1, int n2){
     return n1+n2+2;
    }
}


public class Method_Overriding {
    public static void main(String[] args ){
    AdvCalc ob= new AdvCalc();
    int output= ob.add(4, 5);
    System.out.println(output);
    }
}
