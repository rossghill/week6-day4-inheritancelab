import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("craig", "JP458793C", 1340.05, "Dictator", 80 );
    }


    @Test
    public void testBudget(){
        assertEquals(80.00, director.getBudget(), 0.01);
    }
}
