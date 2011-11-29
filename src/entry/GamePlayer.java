package entry;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import theme.JavaLang;

public class GamePlayer {

    private Set<String> modelAnswers = JavaLang.getInstance().javaLang;
    private List<String> saveTheAnsweredRecord = new ArrayList<String>();
    private Boolean judgeAnswer;
    private Integer outCount;

    public GamePlayer(){
        outCount = 0;
    }

    public Boolean say(String answer) {
        if (!(judgeAnswer = neverSaid(answer) && modelAnswers.contains(answer))) {
            outCount++;
        }
        return judgeAnswer;
    }

    private Boolean neverSaid(String answer) {
        Boolean notRecrodContains = !saveTheAnsweredRecord.contains(answer);
        saveTheAnsweredRecord.add(answer);
        return notRecrodContains;
    }

    public Integer allRecord() {
        return saveTheAnsweredRecord.size();
    }

    public Integer outCount() {
        return outCount;
    }
}
