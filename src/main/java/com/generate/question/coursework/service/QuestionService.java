package com.generate.question.coursework.service;

import com.generate.question.coursework.entities.Question;

import java.util.Collection;
import java.util.Random;

public interface QuestionService {

    boolean add(String question, String answer);

    boolean remove(String question, String answer);

    Collection<Question> getAll();

    Question getRandomQuestion();

    int getSize();

    void setRandom(Random random);
}
