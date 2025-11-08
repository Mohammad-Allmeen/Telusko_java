// Static variable belongs to the class and remains same which is shared by all the object of the class


class Mobile {
    String brand;
    int price;
    static String name; // if i assign this variable as static it will become same for all the object of the class and this will be accesed using the class name 
   
    public void show(){
        System.out.println("Brand: " +brand + "Price: " +price+ "Name: "+name);
    }
}



public class Static_variable {
    public static void main(String [] args){


        Mobile.name= "Smartphone";

        Mobile ob1= new Mobile();
       ob1.brand=" Apple";
       ob1.price= 1700;
       ob1.name= "phone";
       ob1.show();

    Mobile ob2= new Mobile();
       ob2.brand="Samsung";
       ob2.price= 1500;
       ob2.name= "Smartphone";
       ob2.show();


    }
}


