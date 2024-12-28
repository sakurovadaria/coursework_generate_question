package com.generate.question.coursework.service;

import com.generate.question.coursework.entities.Question;
import com.generate.question.coursework.exception.InvalidQuestionRequestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ExaminerServiceImpl implements ExaminerService{

    private static final Logger log = LoggerFactory.getLogger(ExaminerServiceImpl.class);

    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {

        int size = questionService.getSize();
        if (amount < -0 || size < amount) {
            log.error("Wrong requested amount, should be less then" + size);
            throw new InvalidQuestionRequestException(amount, size);
        }

        Set<Question> questions = new HashSet<>();
        while (questions.size() < amount) {

            questions.add(questionService.getRandomQuestion());
        }
        //System.out.println("Questions were retrieved" + questions);
        log.info("Questions were retrieved" + questions);
        return questions;
    }
}
