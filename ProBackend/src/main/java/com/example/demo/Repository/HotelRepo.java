package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.Model.Hotel;
@RepositoryRestResource(collectionResourceRel="hotel",path="hotel")
public interface HotelRepo extends JpaRepository<Hotel, Integer> {

	
	List<Hotel> findByState(String state);
}
