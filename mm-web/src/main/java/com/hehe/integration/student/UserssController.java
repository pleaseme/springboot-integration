package com.hehe.integration.student;


import com.hehe.integration.common.CRM_Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class UserssController {


    @Autowired
    private StudentsServices studentsServices;




    /**
     * 添加学生信息
     */
    @PostMapping("/user/add")
    public CRM_Result adduser(Students students) {
        return studentsServices.addstu(students);
    }

    /**
     * 查询学生信息
     */
    @RequestMapping("/user/selectowninfo")
    public CRM_Result selectowninfo(String phone) {
        List<Students> select = studentsServices.select(phone);
        return CRM_Result.ok(select);
    }


}