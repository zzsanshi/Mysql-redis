package com.project.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.project.bo.StudentBo;
import com.project.dao.StudentDao;
import com.project.service.IStudentCacheService;
@Service(IStudentCacheService.SERVICEID)
public class StudentCacheServiceImpl implements IStudentCacheService {

    @Resource
    private StudentDao studentDao;

    @Override
    public List<StudentBo> getAllStudent() {
        List<StudentBo> list = studentDao.selectAllStudent();
        if(list!=null&& list.size()>0){
            for (StudentBo student : list) {
                System.out.println("查询得到的学生的姓名："+student.getName()+",学生的年龄："+student.getAge()+"学生地址："+student.getAddress());
            }
        }
        return list;
    }

    @Override
    public StudentBo getStudentById(int id) {
        StudentBo student = studentDao.selectByPrimaryKey(id);
        System.out.println("查询id为"+id+"的学生姓名是："+student.getName()+",住址："+student.getAddress());

        return student;
    }

}