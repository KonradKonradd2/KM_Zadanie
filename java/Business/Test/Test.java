import org.apache.commons.io.filefilter;
package Business.Test;

import Business.Department;
import Business.Employee;

public class Test {
        public static void main(String[] args) {

            Employee employee1 = new Employee("John Doe", 30, 5000);
            Employee employee2 = new Employee("Jane Smith", 35, 6000);
            Employee[] employees = {employee1, employee2};

            Department department = new Department("Sales", employees);
            department.displayDepartmentInfo();
        }
}
