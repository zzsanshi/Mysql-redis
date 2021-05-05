package com.project.service;

import java.util.List;

import com.project.bo.StudentBo;

public interface IStudentCacheService {
    final String SERVICEID="IStudentCacheService";
    public List<StudentBo> getAllStudent();
    public StudentBo getStudentById(int id);

}