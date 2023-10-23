import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        EmployeeService.EmployeeList();
        Scanner sc = new Scanner(System.in);
        int select;
        do {
            menu();

            select = sc.nextInt();
            switch (select) {
                case 1: EmployeeService.addEmployee();
                    break;
                case 2: EmployeeService.viewEmployee();
                    break;
                case 3: EmployeeService.updateEmployee();
                    break;
                case 4: EmployeeService.deleteEmployee();
                    break;
                case 0:  exit();
                    break;
                default:
                    menu();
                    break;
            }


        } while (select != 0);

    }



    public static void exit() {
        System.exit(0);
    }

    public static void menu(){

        System.out.println("****** Employee Managment System ******"
                    +"\n1) Add Employee"
                    +"\n2) View Employee"
                    +"\n3) Update Employee"
                    +"\n4) Delete Employee"
                    +"\n0) Exit");
    }

}