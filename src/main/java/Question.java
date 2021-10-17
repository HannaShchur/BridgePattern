public interface Question {
    void nextQuestion();
    void previousQuestion();
    void newQuestion(String question);
    void deleteQuestion(int quest);
    void addQuestions();
    void showAllQuestionsWithIndexes();
}
