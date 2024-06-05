package com;

public class Student {
    private int id;
    private String name;
    private Exam exam;
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setExam(Exam exam) {
        this.exam = exam;
    }

   public void show()
   {
    System.out.println(id + " " + name );
   }
}
