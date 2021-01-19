package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Staff;
import com.example.demo.Repository.StaffRepo;

@Service
public class StaffServiceImpl implements StaffService{

	@Autowired
	private StaffRepo repo;
	
	@Override
	public List<Staff> getStaffs() {
		return repo.findAll();
	}

	@Override
	public Optional<Staff> getStaff(int id) {
		return repo.findById(id);
	}

	@Override
	public Staff addStaff(Staff staff) {
		return repo.save(staff);
	}

	@Override
	public void deleteStaff(int id) {
		Staff p = repo.getOne(id);
		repo.delete(p);
	}

	@Override
	public Staff updateStaff(Staff staff) {
		repo.save(staff);
		return staff;
	}

}
