import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
       manager = new Manager("Ross", "JK676767Q", 5000000.0, "CEO");
    }

    @Test
    public void getDeptName() {
        assertEquals("CEO", manager.getDeptName());
    }


}
