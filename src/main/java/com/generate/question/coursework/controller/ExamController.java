package com.generate.question.coursework.controller;

import com.generate.question.coursework.entities.Question;
import com.generate.question.coursework.service.ExaminerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;

public class ExamController {

    private final ExaminerService service;

    public ExamController(ExaminerService service) {
        this.service = service;

    }

    @GetMapping("/get/{amount}")
    public Collection<Question> getQuestions(@PathVariable int amount) {
        return service.getQuestions(amount);
    }
}
