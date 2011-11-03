package entry;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;

public class SolutionTest {

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
        String new_model_answer1="nma1";
        String new_model_answer2="nma2";
        Solution solution = new Solution();

        Set<String> new_model_answers = solution.addModelAnswer(new_model_answer1);
        assertEquals(1 ,new_model_answers.size());
        assertTrue(new_model_answers.contains(new_model_answer1));

        new_model_answers = solution.addModelAnswer(new_model_answer2);
        assertEquals(2, new_model_answers.size());
        assertTrue(new_model_answers.contains(new_model_answer2));
        assertTrue(new_model_answers.contains(new_model_answer1));
    }

    @Test
    public void addNewModelMultipleCaseTest(){
        Solution solution = new Solution();
        String[] add_model_answer = {"entry1", "entry2"};

        Set<String> add_multiple_answer;
        for(String answer:add_model_answer)
            add_multiple_answer = solution.addModelAnswer(answer);
        add_multiple_answer = solution.addModelAnswer(add_model_answer[0]);

        assertEquals(2,add_multiple_answer.size());
    }

}
