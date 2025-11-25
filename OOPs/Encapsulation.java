package OOPs;

class Human{
private String name="Allmeen"; // when you declare the variable as private now it restricts the user and they wont be able to access in the other class 
private int age= 24; // therefore if you want to access then you can create a method called getter and setter

// Getters
// get method is utilized to get the data from the other class
public int getAge(){
    return age;
}

public String getName(){
    return name;
}

// Setters 
// set method is utlized to set the data for that particular and specific variable

public void setAge(int a){
    age=a;
}

public void setName(String n){
    name =n;
}

}



public class Encapsulation {
    public static void main(String [] args)
    {
     Human obj = new Human();
     
     //System.out.println(obj.name);// error because the variable is private and cannot be accesed directly 
    
     System.out.println(obj.getName()+ " : " +obj.getAge());// now using the method you can access the variable 
      

     obj.setAge(25);
     obj.setName("Arshi");
     System.out.println(obj.getAge());

    
    }
}
