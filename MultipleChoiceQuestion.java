import javax.swing.JOptionPane;


public class MultipleChoiceQuestion {

    static int nQuestions = 0;
    static int nCorrect = 0;

    String question;
    String correctAnswer;

    String ask( ){
        String answer;

        while(true) {
            answer = JOptionPane.showInputDialog(question);
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

    void check(){
//        increment number of questions
        nQuestions++;
        String answer = ask();
        if(answer.equals(correctAnswer) ){
//           increment number of correct answers
            nCorrect++;
            JOptionPane.showMessageDialog(null," Correct!");


        }
        else{
            JOptionPane.showMessageDialog(null," Incorrect!, the correct answer is " + correctAnswer);

        }
    }

    static void showResults(){
        JOptionPane.showMessageDialog(null,nCorrect + " correct out of questions! " + nQuestions);
    }


    MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer){
        question = query+"\n";
        question += "A. "+a+"\n";
        question += "B. "+b+"\n";
        question += "C. "+c+"\n";
        question += "D. "+d+"\n";
        question += "E. "+e+"\n";

        correctAnswer = answer.toUpperCase();
    };
}
