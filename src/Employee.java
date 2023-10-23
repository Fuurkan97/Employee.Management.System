import java.util.Scanner;

public class Employee {
   private  String name;
   private String id;
   private String department;
   private int salary;


   public Employee(String id,String name){
       this.name=name;
       this.id=id;
   }
   public Employee( String id,String name, String department, int salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
   @Override
     public String toString() {
        return "Employee [id=" + id + ", Name=" + name + ", Department=" + department + ", Salary=" + salary + "]";
    }


}
