package com.example.ClientDbJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyJPAInterface extends JpaRepository<StudentPojo, Integer> {

}
