package kz.aitu.springsurvey.repositories;

import kz.aitu.springsurvey.models.Question;

import java.util.List;

public interface QuestionRepositoryInterface {

        // Method to save a question
        void saveQuestion(Question question);

        // Method to update a question
        void updateQuestion(Question question);

        // Method to delete a question
        void deleteQuestion(Question question);

        // Method to find a question by its ID
        Question findQuestionById(int id);

        // Method to get all questions
        List<Question> getAllQuestions();
    }
}
