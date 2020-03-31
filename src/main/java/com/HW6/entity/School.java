package com.HW6.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "school")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "type", nullable = false)
    private TypeSchool type;

    @Column(name = "name")
    private String name;

    @ManyToOne(cascade = CascadeType.ALL, targetEntity = Student.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_student")
    private Student student;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "school_subject",
            joinColumns = @JoinColumn(name = "school_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id"))
    private List<School> schools;

    public List<School> getSchools() {
        return schools;
    }

    public void setSchools(List<School> schools) {
        this.schools = schools;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Embedded
    private Modification modification = new Modification();

    @PreRemove
    private void preRemove() {
        System.out.println(name + " School was deleted");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypeSchool getType() {
        return type;
    }

    public void setType(TypeSchool type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Modification getModification() {
        return modification;
    }

    public void setModification(Modification modification) {
        this.modification = modification;
    }
}