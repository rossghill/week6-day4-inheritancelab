package staff;

public class Employee {

    String name;
    String NI_number;
    double salary;

    public Employee(String name, String NI_number, double salary) {
        this.name = name;
        this.NI_number = NI_number;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNINumber() {
        return this.NI_number;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double raise) {
        if (raise > 0) {
        this.salary += raise;
        }
    }

    public double getBonus() {
        return this.salary * 0.01;
    }

    public void changeName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }

    }
}
