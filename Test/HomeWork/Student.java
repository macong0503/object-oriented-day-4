package com.hqyj.mc.Test.HomeWork;

public class Student {
    private int score;

    public Student() {
    }

    public Student(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) throws NoSuchFieldException {
        if (score<0){
            throw new NoSuchFieldException("输入错误");
        }
        this.score = score;
    }
}
