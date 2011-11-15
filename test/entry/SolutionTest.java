package entry;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import theme.JavaLang;

public class SolutionTest {

    @Test
    public void testThemeSelect() {
        Solution solution = new Solution(JavaLang.getInstance().javaLang);
        assertTrue(solution.isTheRight("Integer"));
        assertFalse(solution.isTheRight("List"));
    }

    @Test
    public void resultOfSolutionTest() {
        String model_answer = "java.lang";
        Solution solution = new Solution();
        solution.addModelAnswer(model_answer);
        assertTrue(solution.isTheRight(model_answer));
        assertFalse(solution.isTheRight("incorrect_answer"));
    }

    @Test
    public void addNewModelAnswerTest() {
        String newModelAnswer1="nma1";
        String newModelAnswer2="nma2";
        Solution solution = new Solution();

        Set<String> newModelAnswers = solution.addModelAnswer(newModelAnswer1);
        assertEquals(1 ,newModelAnswers.size());
        assertTrue(newModelAnswers.contains(newModelAnswer1));

        newModelAnswers = solution.addModelAnswer(newModelAnswer2);
        assertEquals(2, newModelAnswers.size());
        assertTrue(newModelAnswers.contains(newModelAnswer2));
        assertTrue(newModelAnswers.contains(newModelAnswer1));
    }

    @Test
    public void addNewModelMultipleCaseTest(){
        Solution solution = new Solution();
        String[] addModelAnswer = {"entry1", "entry2"};

        Set<String> addMultipleAnswer;
        for(String answer:addModelAnswer)
            addMultipleAnswer = solution.addModelAnswer(answer);
        addMultipleAnswer = solution.addModelAnswer(addModelAnswer[0]);

        assertEquals(2,addMultipleAnswer.size());
    }

    @Test
    public void addNewModelAnswersTest() {
        Solution solution = new Solution();
        List<String> newModels = new ArrayList<String>();
        newModels.add("Integer");
        newModels.add("String");
        newModels.add("Boolean");
        solution.addModelAnswers(newModels);

        assertTrue(solution.isTheRight("String"));
        assertTrue(solution.isTheRight("Integer"));
        assertFalse(solution.isTheRight("List"));
    }
}
