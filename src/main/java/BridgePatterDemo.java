public class BridgePatterDemo {
    public static void main(String[] args) {
        QuestionFormat questionFormat = new QuestionFormat("Java programming language");
        questionFormat.q = new JavaQuestions();
        questionFormat.catalog = "think up another question  :)";
        questionFormat.newQ("When Java was born");
        questionFormat.delete(2);
        questionFormat.displayAll();

    }
}

