/*

Set is the type of collection that stores unique value means duplicate values are prohibited
Set stores the values in the random format means value are not organized

*/

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSets {
    public static void main(String[] args) {
        


        //SET
        // No duplicate 
        //Values not stored in order
        Set<Integer> values= new HashSet<>();

        for (int i = 10; i < 20; i++) {
            values.add(i);
        }

        System.out.println("Values stored in the Set are-");
        for(int n: values){
            System.out.println(n); // In Set here the value will not be printed in sequential order therefore there is no Index you cannot access the value through index
        }
        


        // TREESET
        // to store and automatically assign the element in sequential order you may use TreeSet

        Set<Integer> seqValues = new TreeSet<>();
        for (int i = 10; i < 20; i++) {
            seqValues.add(i);
        }

        System.out.println("Values stored in the TreeSet are-");

        for(int n:seqValues){
            System.out.println(n);
        }

        // LinkedHashSet-
        // Values are stored in order
        // No duplicate

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(20);
        linkedHashSet.add(15);
        linkedHashSet.add(35);
        linkedHashSet.add(40); // Duplicate, ignored

        System.out.println(linkedHashSet);
        
    }
}
