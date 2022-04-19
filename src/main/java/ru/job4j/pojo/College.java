package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivan Pupkin");
        student.setGroup("404");
        student.setEnrolmentDate(new Date());
        System.out.println(student.getFullName() + " студент группы "
                + student.getGroup() + " зачислен " + student.getEnrolmentDate());
    }
}
