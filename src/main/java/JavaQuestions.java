import java.util.ArrayList;
import java.util.List;

public class JavaQuestions implements Question{
    public static final List<String> questions = new ArrayList<>();
    private int current = 0;

    @Override
    public void nextQuestion() {
        if(current<questions.size()-1) {
            current++;
            System.out.println("Next question: " + questions.get(current));;
        }
    }

    @Override
    public void previousQuestion() {
        if(current>0) {
            current--;
            System.out.println(questions.get(current));
        }
        else {
            System.out.println("This is the first question");
        }
    }

    @Override
    public void newQuestion(String question) {
        questions.add(question);
    }

    @Override
    public void deleteQuestion(int questionIndex) {
        questions.remove(questionIndex);
    }

    @Override
    public void addQuestion(String quest) {
        questions.add("What is class? ");
        questions.add("What is interface? ");
        questions.add("What is abstraction? ");
        questions.add("How multiple polymorphism is achieved in java? ");
    }

    @Override
    public void showAllQuestionsWithIndexes() {
        questions.forEach(q -> {
            System.out.println(getIndexByQuestion(q) + q);
        });
    }

    private int getIndexByQuestion(String question)  {
        return questions.indexOf(question);
    }
}
