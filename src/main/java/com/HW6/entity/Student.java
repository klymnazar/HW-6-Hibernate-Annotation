package com.HW6.entity;


import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String studentName;

    @Column(name = "last_name")
    private String studentLastName;

    @ManyToOne(cascade = CascadeType.ALL, targetEntity = Subject.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_subject")
    private Subject subject;


    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String
    getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    @PreRemove
    private void preRemove() {
        System.out.println("Student " + studentName + " " + studentLastName + " was deleted");
    }

}