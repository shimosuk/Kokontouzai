package entry;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;

public class DataBaseAccessTest {

    @Test
    public void SearchResultTest() {
        String input = "java.lang";
        Solution searchtest = new Solution();
        searchtest.Add(input);
        assertTrue(searchtest.isTheRight(input));
        assertFalse(searchtest.isTheRight("notFound"));
    }

    @Test
    public void DBAddTest() {
        String entry="entry";
        String entry2="entry2";
        Solution addtest = new Solution();

        Set<String> set = addtest.Add(entry);
        assertEquals(1 ,set.size());
        assertTrue(set.contains(entry));

        set = addtest.Add(entry2);
        assertEquals(2, set.size());
        assertTrue(set.contains(entry2));
        assertTrue(set.contains(entry));
    }

    @Test
    public void EntryMultipleTest(){
        Solution multiple = new Solution();
        String[] entrys = {"entry1", "entry2"};

        Set<String> set;
        for(String entry:entrys)
            set = multiple.Add(entry);
        set = multiple.Add(entrys[0]);

        assertEquals(2,set.size());
    }

}
