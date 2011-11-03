package entry;

import java.util.HashSet;
import java.util.Set;

public class Solutionist {

    private static Set<String> set;
    public Solutionist(){
        set = new HashSet<String>();
    }
    public boolean SearchResult(String input) {
        return set.contains(input);
    }

    public Set<String> Add(String entry) {
        set.add(entry);
        return set;
    }
}
