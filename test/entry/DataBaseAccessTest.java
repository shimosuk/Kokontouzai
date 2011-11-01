package entry;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;

public class DataBaseAccessTest {

    @Test
    public void SearchResultTest() {
        String input = "java.lang";
        assertTrue(DataBaseAccess.SearchResult(input));
    }

    @Test
    public void AddTest() {
        String entry="entry";
        Set<String> set = DataBaseAccess.Add(entry);
        assertEquals(1 ,set.size());
        assertTrue(DataBaseAccess.Add(entry).contains(entry));

        String entry2="entry2";
        set = DataBaseAccess.Add(entry2);
        assertEquals(2, set.size());
        assertTrue(DataBaseAccess.Add(entry2).contains(entry2));
        assertTrue(DataBaseAccess.Add(entry).contains(entry));
    }

}
