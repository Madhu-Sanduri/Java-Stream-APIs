public class Employee {
    private String name;
    private int id;
    private double salary;
    private String designation;

    public Employee( int id, String name,double salary, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", id=" + id +", salary=" + salary +
                ", designation='" + designation + '\'' +
                '}';
    }
}
