package entry;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataBaseAccessTest {

    @Test
    public void CheckOnDBTest() {
        String input = "java.lang";
        assertTrue(DataBaseAccess.CheckOnDB(input));
    }

}
