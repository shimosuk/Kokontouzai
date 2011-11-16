package entry;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import theme.JavaLang;

public class ModelAnswersTest {

    @Test
    public void testThemeSelect() {
        ModelAnswers modelAnswers = new ModelAnswers(JavaLang.getInstance().javaLang);
        assertTrue(modelAnswers.isTheSame("Integer"));
        assertFalse(modelAnswers.isTheSame("List"));
    }

    @Test
    public void resultOfSolutionTest() {
        ModelAnswers modelAnswers = new ModelAnswers();
        modelAnswers.addModelAnswer("java.lang");
        assertTrue(modelAnswers.isTheSame("java.lang"));
        assertFalse(modelAnswers.isTheSame("incorrect_answer"));
    }

    @Test
    public void addNewModelAnswerTest() {
        ModelAnswers modelAnswers = new ModelAnswers();

        Set<String> newModelAnswers = modelAnswers.addModelAnswer("newModelAnswer");
        assertEquals(1 ,newModelAnswers.size());
        assertTrue(newModelAnswers.contains("newModelAnswer"));

        newModelAnswers = modelAnswers.addModelAnswer("util");
        assertEquals(2, newModelAnswers.size());
        assertTrue(newModelAnswers.contains("util"));
        assertTrue(newModelAnswers.contains("newModelAnswer"));
    }

    @Test
    public void addNewModelMultipleCaseTest(){
        ModelAnswers modelAnswers = new ModelAnswers();
        String[] addModelAnswer = {"entry1", "entry2"};

        Set<String> addMultipleAnswer;
        for(String answer:addModelAnswer)
            addMultipleAnswer = modelAnswers.addModelAnswer(answer);
        addMultipleAnswer = modelAnswers.addModelAnswer(addModelAnswer[0]);

        assertEquals(2,addMultipleAnswer.size());
    }

    @Test
    public void addNewModelAnswersTest() {
        ModelAnswers modelAnswers = new ModelAnswers();
        List<String> newModels = new ArrayList<String>();
        newModels.add("Integer");
        newModels.add("String");
        newModels.add("Boolean");
        modelAnswers.addModelAnswers(newModels);

        assertTrue(modelAnswers.isTheSame("String"));
        assertTrue(modelAnswers.isTheSame("Integer"));
        assertFalse(modelAnswers.isTheSame("List"));
    }
}
