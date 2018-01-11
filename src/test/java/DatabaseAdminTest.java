import org.junit.Before;
import org.junit.Test;
import techstaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin db_admin;

    @Before
    public void before(){
        db_admin = new DatabaseAdmin("Trump",  "KLL$%$%%%", 300.03);
    }

    @Test
    public void testHasSalary(){
        db_admin.raiseSalary(0.40);
        assertEquals(300.43,  db_admin.getSalary(), 0.01);
    }

}
