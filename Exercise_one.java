

class Employee{
    
    private String name;
    private double salary;
    
   public Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    
    public String getName(){
        return name;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public String getDetails(){
        return "Name: "+ name + " : " + " Salary: "+salary;
    }
}


// TODO: Create a class Manager that:
// - Extends Employee

class Manager extends Employee{
    private String department;
    
    Manager(String name, double salary, String department)
    {
        super(name,salary);
        this.department= department;
        
    }
    
    public String getDetails(){
       return super.getDetails() + "Department: " + department;
    }
}


public class Exercise_one {
    public static void main(String[] args) {

    Employee emp= new Employee("Alice", 500000.0);
    Manager mng= new Manager("Bob", 800000.0, "Department");
        
       System.out.println(emp.getDetails());
       System.out.println(mng.getDetails());
        
    }
}
