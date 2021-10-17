public class QuestionFormat extends QuestionManager{
    public QuestionFormat(String catalog) {
        super(catalog);
    }
    public void displayAll() {
        System.out.println("\n---------------------------------------------------------");
        super.display();
        System.out.println("-----------------------------------------------------------");
    }
}
