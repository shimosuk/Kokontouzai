package entry;

import java.util.HashSet;
import java.util.Set;

public class ModelAnswers {

    private Set<String> modelAnswers;
    public ModelAnswers(){
        modelAnswers = new HashSet<String>();
    }

    public ModelAnswers(Set<String> themeAnswers) {
        modelAnswers = themeAnswers;
    }

    public boolean isTheSame(String answer) {
        return modelAnswers.contains(answer);
    }

    public void addModelAnswers(Set<String> newModelAnswers) {
        modelAnswers = newModelAnswers;
    }

    public Set<String> addModelAnswer(String newModelAnswer) {
        modelAnswers.add(newModelAnswer);
        return modelAnswers;
    }
}
