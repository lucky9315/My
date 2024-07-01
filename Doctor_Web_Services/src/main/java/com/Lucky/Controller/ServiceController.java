package com.Lucky.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Lucky.Model.Solution;
import com.Lucky.Service.ServiceSolutionInt;


@CrossOrigin
@RestController
@RequestMapping("service")
public class ServiceController 
{
	@Autowired
	private ServiceSolutionInt serSolutionInt;
	
	@GetMapping("getAllServices")
	public ResponseEntity<List<Solution>> getAllService()
	{
		List<Solution> solutionList = serSolutionInt.getAllServices();
		return ResponseEntity.ok(solutionList);
	}
	@GetMapping("getService")
	public ResponseEntity<Solution> getService(@RequestParam int id)
	{
		Solution solution = serSolutionInt.getService(id);
		if(solution==null)
		{
			return ResponseEntity.ok(null);
		}
		else
		{
			return ResponseEntity.ok(solution);
		}
	}
	
	@DeleteMapping("deleteService")
	public ResponseEntity<Boolean> deleteService(@RequestParam int id)
	{
			serSolutionInt.deleteService(id);
			return ResponseEntity.ok(true);
	}
	
	@PostMapping("saveService")
	public ResponseEntity<Solution> saveService(@RequestBody Solution solution)
	{
			Solution solution2=serSolutionInt.saveService(solution);
			return ResponseEntity.ok(solution2);
	}
	
	@PutMapping("updateService")
	public ResponseEntity<Solution> updateService(@RequestBody Solution solution)
	{
			Solution solution2DataBase=serSolutionInt.getService(solution.getId());
			solution2DataBase.setImg(solution.getImg());
			solution2DataBase.setName(solution.getName());
			Solution solution2=serSolutionInt.saveService(solution);
			return ResponseEntity.ok(solution2);
	}
	
	
}
