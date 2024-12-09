package com.mycompany.projectphase11;

public class Question {
    private String text;
    private String[] options;
    private String correctAnswer;

    public Question(String text, String[] options, String correctAnswer) {
        this.text = text;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getText() {
        return text;
    }

    public String[] getOptions() {
        return options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public boolean isCorrect(String answer) {
        return correctAnswer.equalsIgnoreCase(answer.trim());
    }

    @Override
    public String toString() {
        StringBuilder display = new StringBuilder(text + "\n");
        for (int i = 0; i < options.length; i++) {
            display.append((i + 1) + ". " + options[i] + "\n");
        }
        return display.toString();
    }
}
