package net.javaguides.hibernate;


import java.util.List;

import net.javaguides.hibernate.dao.StudentDao;
import net.javaguides.hibernate.entity.Student;

public class App {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        Student student = new Student("Yassine", "Yassine", "yass@javaguides.com");
        studentDao.saveStudent(student);

        Student student2 = new Student("Yumi", "ben Yumi", "yumi@javaguides.com");
        studentDao.saveStudent(student2);

        List < Student > students = studentDao.getStudents();
        students.forEach(s -> System.out.println(s.getFirstName()));
    }
}