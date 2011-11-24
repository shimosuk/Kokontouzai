package entry;

import static org.junit.Assert.*;

import org.junit.Test;

public class GamePlayerTest {

    @Test
    public void testJudgeForOnce() {
        GamePlayer modelAnswers = new GamePlayer();
        assertTrue(modelAnswers.isTheSame("Integer"));
        assertFalse(modelAnswers.isTheSame("Integer"));
    }

    @Test //TODO 名前変更（正しい答え、correctAnswerかどうかを判断するような名前）
    public void testCheckInputAnswer() {
        GamePlayer modelAnswers = new GamePlayer();
        assertTrue(modelAnswers.isTheSame("Integer"));
        assertFalse(modelAnswers.isTheSame("List"));
    }

    @Test
    public void testReadAnsweredList() {
        GamePlayer modelAnswers = new GamePlayer();
        modelAnswers.isTheSame("Integer");
        modelAnswers.isTheSame("String");
        assertEquals(2, (int)modelAnswers.isAll());

        modelAnswers.isTheSame("Integer");
        modelAnswers.isTheSame("List");
        assertEquals(4, (int)modelAnswers.isAll());
    }
}
