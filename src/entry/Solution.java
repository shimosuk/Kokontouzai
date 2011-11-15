package entry;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    private Set<String> modelAnswers;
    public Solution(){
        modelAnswers = new HashSet<String>();
    }

    public Solution(Set<String> themeAnswers) {
        modelAnswers = themeAnswers;
    }

    public boolean isTheRight(String answer) {
        return modelAnswers.contains(answer);
    }

    public void addModelAnswers(List<String> newModelAnswers) {
        for(String newModelAnswer : newModelAnswers)
            addModelAnswer(newModelAnswer);
    }

    public Set<String> addModelAnswer(String newModelAnswer) {
        modelAnswers.add(newModelAnswer);
        return modelAnswers;
    }
}
