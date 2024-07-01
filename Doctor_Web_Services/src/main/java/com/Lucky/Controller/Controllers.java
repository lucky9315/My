package com.Lucky.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Lucky.DoctorWebServicesApplication;
import com.Lucky.Model.Doctors;
import com.Lucky.Model.Solution;
import com.Lucky.Service.ServiceSolutionInt;

@RestController
@CrossOrigin
public class Controllers
{
	@Autowired
	private ServiceSolutionInt solutionInt;
	
	@GetMapping("solution")
	public ResponseEntity<Solution> getImageOfSolution(@RequestParam String name)
	{
		Solution solution=solutionInt.getImageOfSolution(name);
		ResponseEntity<Solution> responseEntity=ResponseEntity.ok(solution);
		return responseEntity;
	}
	
}
