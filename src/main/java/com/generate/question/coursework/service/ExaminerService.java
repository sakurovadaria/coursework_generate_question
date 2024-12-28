package com.generate.question.coursework.service;

import com.generate.question.coursework.entities.Question;

import java.util.Collection;

public interface ExaminerService {

    Collection<Question> getQuestions(int amount);
}
