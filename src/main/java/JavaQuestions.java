import java.util.ArrayList;
import java.util.List;

public class JavaQuestions implements Question{
    private final List<String> questions = new ArrayList<>();


    @Override
    public void nextQuestion() {

    }

    @Override
    public void previousQuestion() {

    }

    @Override
    public void newQuestion() {

    }

    @Override
    public void deleteQuestion(String quest) {

    }

    @Override
    public void addQuestion(String quest) {
        questions.add("What is class? ");
        questions.add("What is interface? ");
        questions.add("What is abstraction? ");
        questions.add("How multiple polymorphism is achieved in java? ");
    }
}
