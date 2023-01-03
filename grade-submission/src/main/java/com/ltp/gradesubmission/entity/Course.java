package com.ltp.gradesubmission.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NonNull
    @Column(name = "subject", nullable = false)
    private String subject;

    @NonNull
    @Column(name = "code", nullable = false, unique = true)
    private String code;

    @NonNull
    @Column(name = "description", nullable = false)
    private String description;

    @JsonIgnore
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Grade> grades;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
        name = "course_student", 
        joinColumns = @JoinColumn(
            name = "course_id", 
            referencedColumnName = "id"
            ), 
            inverseJoinColumns = @JoinColumn(
                name = "student_id", 
                referencedColumnName = "id"
                ))
    private Set<Student> students;
}
