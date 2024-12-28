package com.generate.question.coursework;

import com.generate.question.coursework.entities.Question;

import java.util.Set;

public class Constants {

    public static final String QUESTION1 = "One?";
    public static final String QUESTION2 = "Two?";
    public static final String QUESTION3 = "Three?";

    public static final String ANSWER1 = "1";
    public static final String ANSWER2 = "2";
    public static final String ANSWER3 = "3";

    public static final Question FULL_QUESTION1 = new Question(QUESTION1, ANSWER1);
    public static final Question FULL_QUESTION2 = new Question(QUESTION2, ANSWER2);
    public static final Question FULL_QUESTION3 = new Question(QUESTION3, ANSWER3);

    public static final Set<Question> TEST_QUESTION_SET_1 = Set.of(FULL_QUESTION1, FULL_QUESTION2, FULL_QUESTION3);
    public static final Set<Question> TEST_QUESTION_SET_2 = Set.of(FULL_QUESTION1);

    public static final String EMPTY_ANSWER = null;
}
