package org.javarush.m3fp;

public class Question {
    private String question;
    private String answerOption1;
    private String answerOption2;
    private String answerOption3;
    private String answerOption4;
    private int rightAnswer;

    public String getQuestion() {
        return question;
    }

    public String getAnswerOption1() {
        return answerOption1;
    }

    public String getAnswerOption2() {
        return answerOption2;
    }

    public String getAnswerOption3() {
        return answerOption3;
    }

    public String getAnswerOption4() {
        return answerOption4;
    }

    public int getRightAnswer() {
        return rightAnswer;
    }

    public Question(String question, String answerOption1, String answerOption2, String answerOption3, String answerOption4, int rightAnswer) {
        this.question = question;
        this.answerOption1 = answerOption1;
        this.answerOption2 = answerOption2;
        this.answerOption3 = answerOption3;
        this.answerOption4 = answerOption4;
        this.rightAnswer = rightAnswer;
    }
}
