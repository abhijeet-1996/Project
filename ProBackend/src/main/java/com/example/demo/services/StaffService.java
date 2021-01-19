package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.Model.Staff;

public interface StaffService {

	List<Staff> getStaffs();
	Optional<Staff> getStaff(int id);
	Staff addStaff(Staff staff);
	void deleteStaff(int id);
	Staff updateStaff(Staff staff); 
}
