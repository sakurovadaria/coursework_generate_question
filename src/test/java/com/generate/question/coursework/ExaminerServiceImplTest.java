package com.generate.question.coursework;


import com.generate.question.coursework.service.ExaminerServiceImpl;
import com.generate.question.coursework.service.QuestionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.generate.question.coursework.Constants.FULL_QUESTION1;
import static com.generate.question.coursework.Constants.TEST_QUESTION_SET_2;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceImplTest {

    @Mock
    QuestionService mock;

    @InjectMocks
    ExaminerServiceImpl out;

    @Test
    public void getQuestionsTest() {
        when(mock.getSize()).thenReturn(1);
        when(mock.getRandomQuestion()).thenReturn(FULL_QUESTION1);
        assertEquals(TEST_QUESTION_SET_2, out.getQuestions(1));
    }
}
