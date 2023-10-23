import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {

    public static HashSet<Employee> empset = new HashSet<>();

    public static void EmployeeList() {
        Employee emp1 = new Employee("1", "Furkan", "IT", 30000);
        Employee emp2 = new Employee("2", "Ataberk", "IT", 30000);
        Employee emp3 = new Employee("3", "Tutku", "IT", 30000);
        Employee emp4 = new Employee("4", "Cem", "Security", 30000);
        Employee emp5 = new Employee("5", "Erdi", "Technician", 30000);
        Employee emp6 = new Employee("6", "Serjuan", "Translator", 30000);
        Employee emp7 = new Employee("7", "Berk", "PytonEnjoyer", 30000);

        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        empset.add(emp4);
        empset.add(emp5);
        empset.add(emp6);
        empset.add(emp7);
    }

    public static void viewEmployee() {
        for (Employee element : empset) {
            System.out.println(element);

        }
    }

    public static void addEmployee() {
        int idcount = 7;
        Scanner select = new Scanner(System.in);
        System.out.println("Name of the employee : ");
        String name = select.nextLine();
        System.out.println("Department of the employee : ");
        String department = select.nextLine();
        System.out.println("Salaray of the employee :");
        int salary = select.nextInt();
        idcount++;
        Employee emp = new Employee(String.valueOf(idcount), name, department, salary);
        empset.add(emp);

    }

    public static void updateEmployee() {
        System.out.println("Enter id : ");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();

        for (Employee emp : empset) {
            if (emp.getId().equals(id)) {
                while (true) {
                    System.out.println("Choose the info you want to update on the employee:");
                    System.out.println("1) Name\n2) Department\n3) Salary\n4) Finish update");

                    int choice = sc.nextInt();
                    sc.nextLine();

                    switch (choice) {
                        case 1:
                            System.out.println("Enter the new name: ");
                            String newName = sc.nextLine();
                            emp.setName(newName);
                            break;
                        case 2:
                            System.out.println("Enter the new department: ");
                            String newDepartment = sc.nextLine();
                            emp.setDepartment(newDepartment);
                            break;
                        case 3:
                            System.out.println("Enter the new salary: ");
                            int newSalary = sc.nextInt();
                            emp.setSalary(newSalary);
                            break;
                        case 4:
                            return;
                        default:
                            System.out.println("Invalid choice. Please select a valid option.");
                    }
                }
            }
            else {
                System.out.println("No matching id found !");
                return;
            }
        }
    }

    public static void deleteEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Id of the employee you would like to delete : ");
        String id = sc.nextLine();

        Employee employeeToRemove = null;
        for (Employee emp : empset) {
            if (emp.getId().equals(id)) {
                employeeToRemove = emp;
                break;
            }
        }

        if (employeeToRemove != null) {
            empset.remove(employeeToRemove);
            System.out.println(id + " has been successfully deleted");
        } else {
            System.out.println("No matching id found");
        }

    }

}





