import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter details for Employee " + i + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.print("Position (salesperson, manager, or owner): ");
            String position = scanner.nextLine();

            Employee employee = new Employee(name, salary, position);
            employees.add(employee);
        }

        Collections.sort(employees, Comparator.comparing(Employee::getSalary));

        System.out.println("\nList of Employees Sorted by Salary in Ascending Order:");
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName() + ", Salary: " + employee.getSalary() + ", Position: " + employee.getPosition());
        }

        scanner.close();
    }
}