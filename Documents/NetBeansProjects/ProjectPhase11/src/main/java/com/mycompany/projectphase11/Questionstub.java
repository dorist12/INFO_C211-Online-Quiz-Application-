package com.mycompany.projectphase11;

/*
 * Project Name: Quiz Application
 * Author: [Your Name]
 * Date: [Insert Date]
 * Description: This class represents a question in the quiz. It includes
 * attributes for the question text, answer options, and the correct answer.
 */

public class Question {
    
    // Attributes of the Question class
    private String text;         // The question text
    private String[] options;    // The answer options
    private String correctAnswer; // The correct answer to the question

    /*
     * Default constructor.
     * Initializes the Question object with default values.
     */
    public Question() {
        this.text = "";
        this.options = new String[0];
        this.correctAnswer = "";
    }

    /*
     * Parameterized constructor.
     * Initializes the Question object with specific values for text, options, and the correct answer.
     *
     * @param text The question text
     * @param options The answer options
     * @param correctAnswer The correct answer to the question
     */
    public Question(String text, String[] options, String correctAnswer) {
        this.text = text;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    /*
     * Gets the question text.
     *
     * @return The question text
     */
    public String getText() {
        return text;
    }

    /*
     * Sets the question text.
     *
     * @param text The new question text
     */
    public void setText(String text) {
        this.text = text;
    }

    /*
     * Gets the answer options.
     *
     * @return An array of answer options
     */
    public String[] getOptions() {
        return options;
    }

    /*
     * Sets the answer options.
     *
     * @param options An array of new answer options
     */
    public void setOptions(String[] options) {
        this.options = options;
    }

    /*
     * Gets the correct answer.
     *
     * @return The correct answer
     */
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    /*
     * Sets the correct answer.
     *
     * @param correctAnswer The new correct answer
     */
    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
