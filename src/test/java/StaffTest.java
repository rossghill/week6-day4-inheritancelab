import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class StaffTest {

    Employee employee;


    @Before
    public void before() {
        employee = new Employee("Amy", "JL147662C", 400000);
    }

    @Test
    public void canGetName() {
        assertEquals("Amy", employee.getName());
    }

    @Test
    public void canGetNINumber() {
    assertEquals("JL147662C", employee.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(400000.0, employee.getSalary(), 0.01);
    }

//    Add a method named raiseSalary with takes in a parameter of type double to increment the salary.
    @Test
    public void canRaiseSalary(){
        employee.raiseSalary(54.3);
        assertEquals(400054.3, employee.getSalary(), 0.01);
    }

//    Add a method called payBonus which returns 1% of the employees salary.
    @Test
    public void returnBonus() {
        assertEquals(4000.0, employee.getBonus(), 0.01);
    }

    @Test
    public void cannotRaiseSalary() {
        employee.raiseSalary(-500.0);
        assertEquals(400000.0, employee.getSalary(), 0.01);
    }

    @Test
    public void canChangeName(){
        employee.changeName("Alessandro");
        assertEquals("Alessandro", employee.getName());
    }

    @Test
    public void cannotChangeName(){
        employee.changeName("");
        assertEquals("Amy", employee.getName());
    }
}