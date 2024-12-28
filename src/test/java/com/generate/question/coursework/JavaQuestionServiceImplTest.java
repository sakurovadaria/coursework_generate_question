package com.generate.question.coursework;

import com.generate.question.coursework.service.JavaQuestionServiceImpl;
import com.generate.question.coursework.service.QuestionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Random;

import static com.generate.question.coursework.Constants.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class JavaQuestionServiceImplTest {
    private final QuestionService out = new JavaQuestionServiceImpl();

    @Test
    void shouldAddQuestion() {
        out.add(QUESTION1, ANSWER1);
        assertTrue(out.getAll().contains(FULL_QUESTION1));
    }

    @Test
    void remove() {
        out.remove(QUESTION1, ANSWER1);
        assertFalse(out.getAll().contains(FULL_QUESTION1));
    }

    @Test
    void getAll() {
        out.add(QUESTION1, ANSWER1);
        out.add(QUESTION2, ANSWER2);
        out.add(QUESTION3, ANSWER3);
        assertTrue(out.getAll().containsAll(List.of(FULL_QUESTION1, FULL_QUESTION2, FULL_QUESTION3)));
    }

    @Test
    void getRandomQuestion() {
        out.add(QUESTION1, ANSWER1);
        out.add(QUESTION2, ANSWER2);

        Random random = mock(Random.class, withSettings().withoutAnnotations());
        when(random.nextInt((anyInt()))).thenReturn(1);

        out.setRandom(random);
        assertEquals(FULL_QUESTION2, out.getRandomQuestion());
    }
}
