package com.hehe.integration.student;


import com.hehe.integration.common.CRM_Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsServicesImpl implements StudentsServices {


    @Autowired
     private StudentsRepository studentsRepository;

    @Override
    public CRM_Result addstu(Students students) {
        studentsRepository.save(students);
        System.out.println("插入成功");
        return null;
    }

    @Override
    public List<Students> select(String phone) {
        List<Students> byPhoneEquals = studentsRepository.findByPhoneEquals(phone);
        return byPhoneEquals;
    }

    @Override
    public List<Students> selectallStu() {
        List<Students> all = studentsRepository.findAll();
        return all;
    }
}
