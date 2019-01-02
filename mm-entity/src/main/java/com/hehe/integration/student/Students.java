package com.hehe.integration.student;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@DynamicUpdate
public class Students {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String phone;
    private String name;
    private String sex;
    private String birthday;
    private String major;
    private String majorlasss;
    private String reward;
    private String sales;
    private String resume;
}
