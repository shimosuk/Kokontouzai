package entry;

import java.util.HashSet;
import java.util.Set;

public class Solutionist {

    private static Set<String> model_answers;
    public Solutionist(){
        model_answers = new HashSet<String>();
    }
    public boolean isTheRight(String answer) {
        return model_answers.contains(answer);
    }

    public Set<String> addModelAnswer(String new_model_answer) {
        model_answers.add(new_model_answer);
        return model_answers;
    }
}
