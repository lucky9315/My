package com.Lucky.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;

import com.Lucky.Model.Solution;
public interface SolutionRepo extends JpaRepository<Solution,Integer> 
{

	public abstract Solution findByName(String name);
	
}
