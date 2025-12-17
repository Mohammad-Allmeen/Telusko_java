import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CollectionComparatorComparable {
    public static void main(String[] args) {

        // this method you can to sort by your own logic
        // Example - In this i am sorting the last digit number

        // for this you can use comparator, and it is an interface so you can eithere
        // implement it by class or by anonymous class

        // COMPARATOR by anonymous class

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {

                if (i % 10 > j % 10) {
                    return 1; // if you return 1 the numbers will be swapped and -1 if you do not want to swap
                } else {
                    return -1;
                }
            }
        };

        List<Integer> nums = new ArrayList<>();

        nums.add(79);

        nums.add(52);

        nums.add(65);

        nums.add(71);

        nums.add(36);

        Collections.sort(nums, com); // here you will require to pass the List along with the comparator

        System.out.println(nums);



          Comparator<String> comList = new Comparator<String>() {
            public int compare(String i, String j) {

                if (i.length()>j.length()) {
                    return 1; // if you return 1 the numbers will be swapped and -1 if you do not want to swap
                } else {
                    return -1;
                }
            }
        };

        List<String> strList = new ArrayList<>();

        strList.add("MohammadAllmeen");
        strList.add("Arshi");
        strList.add("Alisha");
        strList.add("Ahad");
        strList.add("Arslaan");


        Collections.sort(strList, comList);

        System.out.println(strList);

      


    }
}