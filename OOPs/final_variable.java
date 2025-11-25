package OOPs;


/*
 Final varible in java has 3 main funtionality

 1. Final when used with variable will make the variable constant and unmodifiable

 2. Final keyword when used with class, then that class will no be extended by any other class means there cannot be inheritance applicable through tha class

 3. Final keyword when used with method, then nobody will be able to override that method
 */


 //final class Calcu{   // making the class final will stop the inheritance 
class Calcu{
 
    public final void show (){
        System.out.println("This is work of Allmeen");
    }

    public void add(){
        System.out.println("The answer for the addition is:"+ 4+3);
    }

}



class AdvCalcu extends Calcu{

    // public void show (){      // when i will make the show method in the super class as final it will stop the overriding 
    //     System.out.println("This is work of XYZ");
    // }

    public void add(int a, int b){
        System.out.println(a+b);
    }
 
}


public class final_variable {
    public static void main(String [] args){

        final double pie= 3.21;
    //    pie= 3.2;  // this will give error 
    


AdvCalcu ob1= new AdvCalcu();
ob1.show();
ob1.add(3,4);





    }
}
