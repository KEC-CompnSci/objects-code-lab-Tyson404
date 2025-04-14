import java.util.Scanner;


public class Question {
    private String question;
    public int totalMarks;
    private String answer;
    private String studentAnswer;

    public Question(String question, int totalMarks, String answer){
        this.question = question;
        this.totalMarks = totalMarks;
        this.answer = answer;
        this.studentAnswer = "";
    }
    public void AskQuestion(Scanner scanner){
        System.out.println("Question: " + this.question + " (" + totalMarks + " marks)");
        System.out.print("Your answer: ");
        studentAnswer = scanner.nextLine();
    }

    public int CheckAnswer(){
        if (studentAnswer.equals(answer)) {
            return this.totalMarks;
        } else {
            return 0;
        }
    }
}