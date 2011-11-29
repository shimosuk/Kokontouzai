package entry;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import theme.JavaLang;

public class GamePlayer {

    private Set<String> modelAnswers = JavaLang.getInstance().javaLang;
    private List<String> saveTheAnsweredRecord = new ArrayList<String>();

    public GamePlayer(){
    }

    //TODO: booleanからBooleanへ！オートボクシングが無駄に働いている
    public Boolean say(String answer) {
        return neverSaid(answer) && modelAnswers.contains(answer);
    }

    private Boolean neverSaid(String answer) {
        Boolean notRecrodContains = !saveTheAnsweredRecord.contains(answer);
        saveTheAnsweredRecord.add(answer);
        return notRecrodContains;
    }

    public Integer allRecord() {
        return saveTheAnsweredRecord.size();
    }
}
