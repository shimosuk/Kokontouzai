package entry;

import java.util.HashSet;
import java.util.List;
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

    public void addModelAnswers(List<String> newModelAnswers) {
        for(String newModelAnswer : newModelAnswers)
            addModelAnswer(newModelAnswer);
    }

    public Set<String> addModelAnswer(String newModelAnswer) {
        modelAnswers.add(newModelAnswer);
        return modelAnswers;
    }
}
