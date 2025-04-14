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
        System.out.println("Question: " + question + " (" + totalMarks + " marks)");
        System.out.print("Your answer: ");
        studentAnswer = scanner.nextLine();
        System.out.println(studentAnswer);
    }

    public int CheckAnswer(){
        if (studentAnswer.equals(answer)) {
            return totalMarks;
        } else {
            return 0;
        }
    }
}