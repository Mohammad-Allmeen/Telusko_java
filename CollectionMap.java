import java.util.HashMap;
import java.util.Map;

public class CollectionMap {
    public static void main(String[] args) {
        

        // In Map the key value must be unique the value can be identical, therefore you can say that Keys are Sets and values are list together they form a Map
        Map<String,Double> student = new HashMap<>(); 

        student.put("Allmeen",87.4 ); 
        student.put("Arshi",90.4 ); 
        student.put("Arslan",89.4 ); 
        student.put("Arafat",85.4 ); 
        student.put("Arshi", 91.6);// it will print only one data of Arshi as Keys are unique, 

        System.out.println(student); // this will print all the data stored in the Map

        System.out.println("Method to get all the keys: "+ student.keySet());

        System.out.println("Method to get all the values: "+ student.values());


        // method to print a specific data in the Map with the help of the key
        System.out.println("The % of Allmeen is: "+student.get("Allmeen"));


        //loop on the Map

        for (String key : student.keySet()) {
            System.out.println(key +" : "+ student.get(key));
        }
    }
}
