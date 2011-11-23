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
        return modelAnswers.contains(answer) && avoidTheRepetitionOf(answer);
    }

    private Boolean avoidTheRepetitionOf(String answer) {
        Boolean notRepeat = !checkedAnswers.contains(answer);
        if (notRepeat)
            checkedAnswers.add(answer);
        return notRepeat;
    }
}
