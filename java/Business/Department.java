package Business;

public class Department {
    private String name;
    private Employee[] employees;

    public Department(String name, Employee[] employees) {
        this.name = name;
        this.employees = employees;
    }

    public void displayDepartmentInfo() {
        System.out.println("Department: " + name);
        System.out.println("Employees:");
        for (Employee employee : employees) {
            employee.displayInfo();
            System.out.println("/////////////");
        }
    }
}
