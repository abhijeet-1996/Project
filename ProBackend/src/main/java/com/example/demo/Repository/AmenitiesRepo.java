package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.Model.Amenities;

@RepositoryRestResource(collectionResourceRel="amenities",path="amenities")
public interface AmenitiesRepo extends JpaRepository<Amenities, Integer> {

}
