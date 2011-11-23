package entry;

import static org.junit.Assert.*;

import org.junit.Test;

public class ModelAnswersTest {

    @Test
    public void testJudgeForOnce() {
        ModelAnswers modelAnswers = new ModelAnswers();
        assertTrue(modelAnswers.isTheSame("Integer"));
        assertFalse(modelAnswers.isTheSame("Integer"));
    }

    @Test
    public void testCheckInputAnswer() {
        ModelAnswers modelAnswers = new ModelAnswers();
        assertTrue(modelAnswers.isTheSame("Integer"));
        assertFalse(modelAnswers.isTheSame("List"));
    }
}
