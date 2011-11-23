package entry;

import java.util.Set;

import theme.JavaLang;

public class ModelAnswers {

    private Set<String> modelAnswers = JavaLang.getInstance().javaLang;

    public ModelAnswers(){
    }

    public boolean isTheSame(String answer) {
        return modelAnswers.contains(answer);
    }

    private String JudgeForOnce(String answer) {
        return answer;
    }

    private Set<String> addModelAnswer(String newModelAnswer) {
        modelAnswers.add(newModelAnswer);
        return modelAnswers;
    }
}
