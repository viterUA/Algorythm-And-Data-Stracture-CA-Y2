

public class Employee {
    private String name;
    private double salary;
    private int age;
    private String department;

    // Constructor
    public Employee(String name, double salary, int age, String department) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.department = department;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    // toString method for displaying employee details
    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + ", age=" + age + ", department='" + department + "'}";
    }
}
