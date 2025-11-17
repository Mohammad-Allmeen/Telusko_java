
class Human{
private String name="Allmeen"; // when you declare the variable as private now it restricts the user and they wont be able to access in the other class 
private int age= 24; // therefore if you want to access then you can create a method 

public int getAge(){
    return age;
}

public String getName(){
    return name;
}

}



public class Encapsulation {
    public static void main(String [] args)
    {
     Human obj = new Human();
     
     //System.out.println(obj.name);// error because the variable is private and cannot be accesed directly 
    
     System.out.println(obj.getName()+ " : " +obj.getAge());// now using the method you can access the variable 

    }
}
