package com.HW6;

import com.HW6.entity.*;
import com.HW6.services.SchoolServices;
import com.HW6.services.StudentServices;
import com.HW6.services.SubjectServices;

public class Main {
    public static void main(String[] args) {

        SchoolServices schoolServices = new SchoolServices();
        StudentServices studentServices = new StudentServices();
        SubjectServices subjectServices = new SubjectServices();

        School school = new School();
        Student student = new Student();
        Subject subject = new Subject();

        subject.setSubjectName(SubjectName.INFORMATICS);
        subjectServices.saveSubject(subject);

        student.setStudentName("Piter");
        student.setStudentLastName("Pen");
        student.setSubject(subject);
        studentServices.saveStudent(student);

        school.setType(TypeSchool.HIGH);
        school.setName("Lviv 96");
        school.setStudent(student);
        schoolServices.saveSchool(school);

        System.out.println("id=" + school.getId() + ", " + "name=" + school.getName());

//        school.setName("Lviv 99");
//        schoolServices.updateObject(school);

        System.out.println("id=" + school.getId() + ", " + "name=" + school.getName());


    }
}
