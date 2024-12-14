package phase2;

/**
 * @author benan
 * Class: INFO-C211
 * Author: Ben Anderson
 * Date: December 2024
 */

/*
 * This class represents the quiz itself.
 * It has methods to move the next question and
 * last question, as well as calculating the score.
*/
public class Quiz {
    private Question[] questions;  //Array of questions.
    private int currentQuestionIndex;  //Tracks the current question.

    //Constructor to create a quiz with an array of questions.
    public Quiz(Question[] questions) {
        this.questions = questions;
        this.currentQuestionIndex = 0;  //Set index to 0 to start at first question.
    }

    //Method to get the array of questions.
    public Question[] getQuestions() {
        return this.questions;
    }

    //Method to move to the next question.
    public void nextQuestion() {
        if (currentQuestionIndex < questions.length - 1) {
            currentQuestionIndex++;
        } else {
            System.out.println("You're already at the last question.");
        }
    }

    //Method to move to the previous question.
    public void prevQuestion() {
        if (currentQuestionIndex > 0) {
            currentQuestionIndex--;
        } else {
            System.out.println("You're already at the first question.");
        }
    }

    //Method to get the question you are currently on.
    public Question getCurrentQuestion() {
        return questions[currentQuestionIndex];
    }

    //Method to get the index of the question you're on.
    public int getCurrentQuestionIndex() {
        return currentQuestionIndex;
    }

    //Method to calculate the user's score.
    public double calculateScore(User user) {
        int score = 0;

        //Loop to go through all questions.
        for (int i = 0; i < questions.length; i++) {
            Question question = questions[i];
            //Get the user's answer.
            int userAnswerIndex = user.getAnswers().get(i);  //Get the index of the selected answer.
            //Make sure the index is valid.
            if (userAnswerIndex >= 1 && userAnswerIndex <= question.getOptions().length) {
                //Compare the answer found with the correct one.
                String selectedAnswer = question.getOptions()[userAnswerIndex - 1]; //Get the answer
                if (question.isCorrect(selectedAnswer)) {
                    score++;  //Increment score if correct.
                }
            }
        }
        //Calculate and return the score.
        return (score / (double) questions.length) * 100;
    }
}