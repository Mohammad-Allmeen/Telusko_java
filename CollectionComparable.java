//Comparable is an interface in java.lang used to define the natural ordering of the objects. 
// A class implements comparable when you want to specify how its objects should be compared

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{ // you need to define method present in the Comparable interface
    int age; 
    String name;

    Student(int age, String name){
    this.age=age;
    this.name=name;
    }

// toString() is a method defined in the java.lang.Object class.
// Since every Java class implicitly extends Object, every object in Java has a toString() method.
@Override
    public String toString(){
        return "Student[Age: " +age +", Name: "+name+ "]";
    }

    public int compareTo(Student that) {
     
        return this.age>that.age? 1:-1;
    }
}


public class CollectionComparable {
   public static void main(String[] args) {

//     Comparator<Student> com = new Comparator<Student>() {
//     public int compare(Student i, Student j){
//        if(i.age> j.age){
//         return 1;
//        }else{
//         return 0;
//        }
//     }
// };

// Above code written in short and concise form as Comparator is an functional interface and lambda expression can be used
Comparator<Student> com = (i,j)->{ return i.age>j.age?1:-1;
};
   

    List<Student> studs= new ArrayList<Student>();

    studs.add(new Student(24 , "Allmeen"));
    studs.add(new Student(20 , "Arshi"));
    studs.add(new Student(23 , "Alisha"));
    studs.add(new Student(18 , "Arslan"));
    studs.add(new Student(17 , "Ahad"));

    Collections.sort(studs, com); // sort method can work with only one data that is studs provided you are implemented comarable not comparator

   for (Student s : studs) {
      System.out.println(s);
   }
   } 
}
