package entry;

import java.util.HashSet;
import java.util.Set;

public class DataBaseAccess {

    private static Set<String> set = new HashSet<String>();

    public static boolean SearchResult(String input) {
        return set.contains(input);
    }

    public static Set<String> Add(String entry) {
        set.add(entry);
        return set;
    }
}
