package entry;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import theme.JavaLang;

public class ModelAnswers {

    private Set<String> modelAnswers = JavaLang.getInstance().javaLang;
    private List<String> checkedAnswers = new ArrayList<String>();

    public ModelAnswers(){
    }

    public boolean isTheSame(String answer) {
        if (modelAnswers.contains(answer))
            return avoidTheRepetitionOf(answer);
        return false;
    }

    private Boolean avoidTheRepetitionOf(String answer) {
        if (!checkedAnswers.contains(answer)) {
            checkedAnswers.add(answer);
            return true;
        }
        return !checkedAnswers.contains(answer);
    }
}
