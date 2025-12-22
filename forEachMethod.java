import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class forEachMethod {
   public static void main(String[] args) {
    
    List<Integer> nums = Arrays.asList(4,6,8,9,2,7); // another way of defining the list


    for (int n : nums) {
      System.out.println(n);  
    }



    // the below forEach method takes an object of the consumer and Consumer is an functional interface which contains only one method named "accept" and you need to define the class


    // Consumer <Integer> con = new Consumer<Integer>() {
    //    public void accept(Integer n){
    //     System.out.println(n);
    //    } 
    // };


    Consumer <Integer> con = n-> System.out.println(n); 
    
     // nums.forEach(con);// this [n-> System.out.println(n);] is assigned to varibale con(line no.28)so this whole you can paste in the forEach method


     //Below line is the execution of the above entire method because Consumer being functional interface and the use of Lambda expression
    nums.forEach(n-> System.out.println(n)); //this is for each method and it provides the value from the list as n variable and then you can perform whatever you want

   }
}



