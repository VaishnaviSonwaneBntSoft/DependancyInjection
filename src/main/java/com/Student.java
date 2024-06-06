package com;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    private int id;
    private String name;
    private Exam exam;

    public Student()
    {
        System.out.println("Student Object");
    }


    // public Student(Exam exam)
    // {
    //     System.out.println("Parameter cont called means Exam obj get injected");
    //    // this.exam=exam;
    // }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

 
    public void setExam(Exam exam) {
        this.exam = exam;
        System.out.println("setter method get called");
    }

   public void show()
   {
    System.out.println(id + " " + name );
   
   }
}
