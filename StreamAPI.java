// 1.Stream API is part of Java.util.stream package 

// 2. It returns the object of Stream

// 3. Stream allows you to process the data in the functional(Lambda) declarative way

// 4. Stream does not store data

// 5. Stream cannot be reused for example the word stream related to flow of water once its gone you cannot touch the same water

// 6. Stream can store multiple data and on that with one Stream you can perform multiple operations

// 7. Stream does not changes or effects the original data 

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        
    List<Integer> nums = Arrays.asList(5,9,2,7,8,12);

    Stream<Integer> s1= nums.stream();
//  s1.forEach(n->System.out.println(n)); // the same s1 cannot be reused because Stream is only used once 


//  Applying the filter on s1 Stream that will give another stream that will be stored in the s2

    Stream<Integer> s2= s1.filter(n-> n%2==0);  // the filtered element that is the even number will be stored in the s2 

    Stream<Integer> s3 = s2.map(n-> n*2); // the even number stored in the s2 is now doubled and stored in the s3 stream
    
    s3.forEach(n-> System.out.println(n)); 


    // Above entire process of Stream, written in one line 

    List<Integer> result= nums.stream()
        .filter(n-> n%2==0)
        .map(n->n*2)
        .collect(Collectors.toList());

        System.out.println(result);


        int value= nums.stream()
        .filter(n-> n%2==0)
        .map(n->n*2)
        .reduce(2, (c,e)->c+e);

        System.out.println(value);

     
    }
}
