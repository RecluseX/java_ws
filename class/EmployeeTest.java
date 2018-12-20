import java.io.*;

public class EmployeeTest {
    public static void main (String[] args) {
        Employee empOne = new Employee("Sirius");

        empOne.empAge(25);
        empOne.empDesignation("Programer");
        empOne.empSalary(20000);
        empOne.printEmployee();
    }
}
