package com.ltp.gradesubmission.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltp.gradesubmission.entity.Course;
import com.ltp.gradesubmission.repository.GradeRepository;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    GradeRepository gradeRepository;

    @Override
    public Course getCourse(Long id) {
        return null;
    }

    @Override
    public Course saveCourse(Course course) {
        return null;
    }

    @Override
    public void deleteCourse(Long id) {
    }

    @Override
    public List<Course> getCourses() {
        return null;
    }

}
