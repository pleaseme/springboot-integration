package com.hehe.integration.student;


import com.hehe.integration.common.CRM_Result;

import java.util.List;

public interface StudentsServices {

    /**添加学生*/

    CRM_Result addstu(Students students);

    /**根据手机号码查询*/
    List<Students> select(String phone);

    /**查詢所有學生*/
    List<Students> selectallStu();

}
