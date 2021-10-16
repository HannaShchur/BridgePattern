public class QuestionManager {
    protected Question q;
    public String catalog;

    public QuestionManager(String catalog) {
        this.catalog = catalog;
    }

    public void next() {
        q.nextQuestion();
    }

    public void previous() {
        q.previousQuestion();
    }

    public void newQ(String question) {
        q.newQuestion(question);
    }

    public void delete(int question) {
        q.deleteQuestion(question);
    }

    public void display() {
        q.showAllQuestionsWithIndexes();
    }

    public void displayById(int id) {
        System.out.println(JavaQuestions.questions.get(id));
    }
}
