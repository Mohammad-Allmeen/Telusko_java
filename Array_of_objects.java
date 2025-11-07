class Students{
    int roll;
    String name;
    int marks;
}

public class Array_of_objects {
public static void main(String[] args){

    Students s1= new Students();
    s1.roll=1;
    s1.name="Allmeen";
    s1.marks=95;

    
       Students s2= new Students();
    s2.roll=1;
    s2.name="Arslan";
    s2.marks=96;

       Students s3= new Students();
    s3.roll=1;
    s3.name="Yusuf";
    s3.marks=94;

    Students student[]= new Students[3]; // Array that stores all the objects that are created
    
    // all the three objects i.e s1,s2,s3 are stored in the array "student"
    student[0]= s1; 
    student[1]= s2;
    student[2]= s3;

    // for (int i = 0; i < student.length; i++) {
    //     System.out.println(student[i].name + ":" + student[i].marks);
    // }


    // enhanced for loop for the above process 
    for(Students n:student){
      System.out.println(n.name +": "+ n.marks);
    }
}    
}
