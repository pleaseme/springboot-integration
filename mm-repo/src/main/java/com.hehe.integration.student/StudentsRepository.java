package com.hehe.integration.student;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentsRepository extends JpaRepository<Students,Integer> {

    List<Students> findByPhoneEquals(String phone);
}
