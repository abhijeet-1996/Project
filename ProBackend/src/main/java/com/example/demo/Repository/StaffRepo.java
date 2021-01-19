package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Staff;

@Repository
public interface StaffRepo extends JpaRepository<Staff, Integer> {

}
