package com.Lucky.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Lucky.Model.Doctors;
import com.Lucky.Model.Solution;
import com.Lucky.Repository.SolutionRepo;
import com.Lucky.Service.ServiceSolutionInt;

@Service
public class ServiceSolutionImp implements ServiceSolutionInt 
{

	@Autowired
	private SolutionRepo solutionRepo;
	
	public Solution getImageOfSolution(String name) 
	{
		return solutionRepo.findByName(name);
	}

	public List<Solution> getAllServices() 
	{
		return solutionRepo.findAll();
	}

	public Solution getService(int id) 
	{
		return solutionRepo.findById(id).orElse(null);
	}
	
	public void deleteService(int id)
	{
		 solutionRepo.deleteById(id);
	}

	public Solution saveService(Solution solution) 
	{
		 Solution solutionDataBase  = solutionRepo.save(solution);
		return solutionDataBase;
	}
	
		
}
