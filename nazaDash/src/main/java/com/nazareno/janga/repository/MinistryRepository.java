package com.nazareno.janga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nazareno.janga.model.Ministry;

@Repository
public interface MinistryRepository extends JpaRepository<Ministry, Long>{
	
	

}
