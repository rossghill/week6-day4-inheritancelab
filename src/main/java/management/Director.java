package management;

public class Director extends  Manager {

    private double budget;

    public Director(String name, String NI_Number, double salary, String deptName, double budget){
        super(name, NI_Number, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }
}
