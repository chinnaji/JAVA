
public class Quiz {
    public static void main(String[] args) {

        MultipleChoiceQuestion question1 = new MultipleChoiceQuestion(
                "What is a quiz?",
                "a test of knowledge, especially a brief informal test given to students",
                "42",
                "a duck",
                "to get to the other side",
                "To be or not to be, that is the question.",
                "a");
        MultipleChoiceQuestion question2 = new MultipleChoiceQuestion(
                "What is 2+2 ?",
                "4",
                "42",
                "66",
                "234",
                "5454",
                "a");
        MultipleChoiceQuestion question3 =new MultipleChoiceQuestion(
                "What is 10 * 10 ?",
                "234",
                "23",
                "3243",
                "32389",
                "100",
                "e");
        MultipleChoiceQuestion question4 = new MultipleChoiceQuestion(
                "What is 9 * 9  ?",
                "4",
                "81",
                "66",
                "234",
                "5454",
                "b");
        MultipleChoiceQuestion question5 =new MultipleChoiceQuestion(
                "What is 100 * 100 ?",
                "817738",
                "0928",
                "10000",
                "2893",
                "0",
                "c");

        question1.check();
        question2.check();
        question3.check();
        question4.check();
        question5.check();

        MultipleChoiceQuestion.showResults();


    }

}
