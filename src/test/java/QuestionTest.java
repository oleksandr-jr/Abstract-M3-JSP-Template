import org.javarush.m3fp.Question;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuestionTest {

    @Test
    public void testGetQuestion() {
        Question question = new Question("What is the capital of France?", "Berlin", "Paris", "Madrid", "Rome", 2);
        assertEquals("What is the capital of France?", question.getQuestion());
    }

    @Test
    public void testGetAnswerOption1() {
        Question question = new Question("What is the capital of France?", "Berlin", "Paris", "Madrid", "Rome", 2);
        assertEquals("Berlin", question.getAnswerOption1());
    }

    @Test
    public void testGetAnswerOption2() {
        Question question = new Question("What is the capital of France?", "Berlin", "Paris", "Madrid", "Rome", 2);
        assertEquals("Paris", question.getAnswerOption2());
    }

    @Test
    public void testGetAnswerOption3() {
        Question question = new Question("What is the capital of France?", "Berlin", "Paris", "Madrid", "Rome", 2);
        assertEquals("Madrid", question.getAnswerOption3());
    }

    @Test
    public void testGetAnswerOption4() {
        Question question = new Question("What is the capital of France?", "Berlin", "Paris", "Madrid", "Rome", 2);
        assertEquals("Rome", question.getAnswerOption4());
    }

    @Test
    public void testGetRightAnswer() {
        Question question = new Question("What is the capital of France?", "Berlin", "Paris", "Madrid", "Rome", 2);
        assertEquals(2, question.getRightAnswer());
    }
}
