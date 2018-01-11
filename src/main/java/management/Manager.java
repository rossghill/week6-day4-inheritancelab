package management;

import staff.Employee;

public class Manager extends Employee {

    String deptName;

    public Manager(String name, String NI_number, double salary, String deptName) {
        super(name, NI_number, salary);
        this.deptName = deptName;

    }

    public String getDeptName() {
        return this.deptName;
    }
}
