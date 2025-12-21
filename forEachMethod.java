import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamAPI {
   public static void main(String[] args) {
    
    List<Integer> nums = Arrays.asList(4,6,8,9,2,7); // another way of defining the list


    for (int n : nums) {
      System.out.println(n);  
    }



    // the below forEach method takes an object of the consumer and Consumer is an functional interface which contains only one method named accept and you need to define the class


    Consumer <Integer> con = new Consumer<Integer>() {
       public void accept(Integer n){
        System.out.println(n);
       } 
    };
   
    nums.forEach(con);

    //nums.forEach(n-> System.out.println(n)); //this is for each method and it provides the value from the list as n variable and then you can perform whatever you want

   }
}
