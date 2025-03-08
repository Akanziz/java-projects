import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

        @Test
        void testQuestion() {
            Question question = new Question("What is 5 + 5?", "10");
            assertEquals("What is 5 + 5?", question.toString());
            assertTrue(question.isCorrect("10"));

            Question question2 = new Question("What is 5 + 5?");
            assertEquals("What is 5 + 5?", question2.toString());
            assertFalse(question2.isCorrect("10"));
        }

        @Test
        void testChoiceQuestion() {

            ChoiceQuestion choiceQuestion = new ChoiceQuestion("Who is the president of the US");
            choiceQuestion.addChoice("joe biden", true);
            choiceQuestion.addChoice("Donald Trump", false);
            choiceQuestion.addChoice("Kai Cenat", false);
            choiceQuestion.addChoice("Kyrie Irving", false);

            assertEquals("Who is the president of the US?\njoe biden\nDonald Trump\nKai Cenatn\nKyrie Irving", choiceQuestion.toString());
            assertTrue(choiceQuestion.isCorrect("joe biden"));
            assertFalse(choiceQuestion.isCorrect("Kai Cenat"));
        }

        @Test
        void testTrueFalseQuestion() {
            TrueFalseQuestion trueFalseQuestion = new TrueFalseQuestion("The square root of 5 is rational", false);
            assertEquals("The square root of 5 is rational.\ntrue\nfalse", trueFalseQuestion.toString());
            assertFalse(trueFalseQuestion.isCorrect("true"));
            assertTrue(trueFalseQuestion.isCorrect("false"));
        }

        @Test
        void testFillInBlankQuestion() {
            FillInBlankQuestion fillInBlankQuestion = new FillInBlankQuestion("5 + 5 = _________");
            fillInBlankQuestion.addChoice("10");
            fillInBlankQuestion.addChoice("ten");
            fillInBlankQuestion.addChoice("TEN");
            fillInBlankQuestion.addChoice("10.0");


            assertEquals("5 + 5 = _________", fillInBlankQuestion.toString());
            assertTrue(fillInBlankQuestion.isCorrect("10"));
            assertTrue(fillInBlankQuestion.isCorrect("ten"));
            assertTrue(fillInBlankQuestion.isCorrect("TEN"));
            assertTrue(fillInBlankQuestion.isCorrect("10.0"));
            assertFalse(fillInBlankQuestion.isCorrect("sqrt(100)"));
        }
    }


}