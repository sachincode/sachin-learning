package com.sachin.learning.callback;

/**
 * @author shicheng.zhang
 * @since 17-4-17 上午9:49
 */
public class Teacher implements Callback {

    private Student student;

    public Teacher(Student student) {
        this.student = student;
    }

    public void askQuestion() {
        System.out.println("老师开始提问");
        student.resolveQuestion(this);
    }

    @Override
    public void tellAnswer(int answer) {
        System.out.println("知道了，你的答案是: " + answer);
    }
}
