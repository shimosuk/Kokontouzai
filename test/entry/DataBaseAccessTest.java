package entry;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;

public class DataBaseAccessTest {

    @Test
    public void SearchResultTest() {
        String input = "java.lang";
        DataBaseAccess searchtest = new DataBaseAccess();
        searchtest.Add(input);
        assertTrue(searchtest.SearchResult(input));
    }

    @Test
    public void AddTest() {
        String entry="entry";
        String entry2="entry2";
        DataBaseAccess addtest = new DataBaseAccess();

        Set<String> set = addtest.Add(entry);
        assertEquals(1 ,set.size());
        assertTrue(addtest.Add(entry).contains(entry));

        set = addtest.Add(entry2);
        assertEquals(2, set.size());
        assertTrue(addtest.Add(entry2).contains(entry2));
        assertTrue(addtest.Add(entry).contains(entry));
    }

}
