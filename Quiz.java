//package uop;
import javax.swing.JOptionPane;

public class Quiz {

    static int nCorrect = 0;
    static int nQuestions =0;

    static String ask( String question){
        String answer = "";
        String options = " A. 4\n B. 10\n C. 100\n D. 90\n E. 81\n ";

//        Boolean isAnswered = false;

        while(true) {
            answer = JOptionPane.showInputDialog(question + options);
            answer = answer.toUpperCase();

            if(answer.equals("A") || answer.equals("B")  ||  answer.equals("C")  ||  answer.equals("D")  ||  answer.equals("E")) {
//				isAnswered = true;
                return answer;
//                break;
            }

            else {
                JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E!");
            }
        }
//        return answer;
    }

    static void check(String question, String correctAnswer){
//        increment number of questions
        nQuestions++;
       String answer = ask(question);
       if(answer.equals(correctAnswer) ){
//           increment number of correct answers
           nCorrect++;
           JOptionPane.showMessageDialog(null," Correct!");


       }
       else{
           JOptionPane.showMessageDialog(null," Incorrect!, the correct answer is " + correctAnswer);

       }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        check("What is 2+2 ?\n", "A");
        check("What is 10 * 10 ?\n", "C");
        check("What is 9 * 9 ?\n", "E");
        JOptionPane.showMessageDialog(null,nCorrect + " correct out of questions! " + nQuestions);


    }

}
