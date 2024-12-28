package com.generate.question.coursework.service;

import com.fasterxml.jackson.core.PrettyPrinter;
import com.generate.question.coursework.entities.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionServiceImpl implements QuestionService {

    private final Set<Question> questionRepository = new HashSet<>();
    private Random random = new Random();

    public void setRandom(Random random) {
        this.random = random;
    }

    @Override
    public boolean add(String question, String answer) {
        return questionRepository.add(new Question(question, answer));
    }

    @Override
    public boolean remove(String question, String answer) {
        return questionRepository.remove(new Question(question, answer));
    }

    @Override
    public Collection<Question> getAll() {
        return Set.copyOf(questionRepository);
    }

    @Override
    public Question getRandomQuestion() {
        return List.copyOf(questionRepository).get(random.nextInt(questionRepository.size()));
    }

    @Override
    public int getSize() {
        return questionRepository.size();
    }
}
