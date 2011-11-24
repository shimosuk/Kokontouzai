package entry;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import theme.JavaLang;

public class GamePlayer {

    private Set<String> modelAnswers = JavaLang.getInstance().javaLang;
    private List<String> alreadyAnsweredLists = new ArrayList<String>();

    public GamePlayer(){
    }

    //TODO isRightに変更
    public boolean isTheSame(String answer) {
        return avoidTheRepetitionOf(answer) && modelAnswers.contains(answer);
    }

    private Boolean avoidTheRepetitionOf(String answer) {
        Boolean notRepeatAnswered = !alreadyAnsweredLists.contains(answer);
        alreadyAnsweredLists.add(answer);
        return notRepeatAnswered;
    }

    public Integer isAll() {
        return alreadyAnsweredLists.size();
    }
}
