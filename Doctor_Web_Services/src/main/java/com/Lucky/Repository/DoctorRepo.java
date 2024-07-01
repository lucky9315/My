package com.Lucky.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.Lucky.Model.Doctors;

import jakarta.transaction.Transactional;

@Repository
public interface DoctorRepo extends JpaRepository<Doctors,Integer> 
{
	@Transactional
	@Query("from Doctors")
	public abstract List<Doctors> getAllDoctors();
}
