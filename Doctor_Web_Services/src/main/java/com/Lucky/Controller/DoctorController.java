package com.Lucky.Controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Lucky.Model.Doctors;
import com.Lucky.Service.DoctorInt;

@RestController
@CrossOrigin
public class DoctorController 
{
	@Autowired
	private DoctorInt doctorInt;
	
	@GetMapping("getAllDoctors")
	public ResponseEntity<List<Doctors>> getAllDoctors()
	{
		List<Doctors> doctors= doctorInt.getAllDoctors();
		ResponseEntity<List<Doctors>> entity=ResponseEntity.ok(doctors);
		return entity;
	}
	
	@DeleteMapping("deleteDoctor")
	public ResponseEntity<Boolean> deleteDoctors(@RequestParam int id )
	{
		Doctors doctor=doctorInt.getDoctor(id);
		if(doctor==null)
		{
			return ResponseEntity.ok(false);
		}
		else
		{
			doctorInt.deleteDoctor(id);
			return ResponseEntity.ok(true);
		}
	}
	
	
	@PutMapping("updateDoctor")
	public ResponseEntity<Boolean> upadateDoctors(@RequestBody Doctors doctor )
	{
		Doctors doctorDataBase=doctorInt.getDoctor(doctor.getId());
		doctorDataBase.setField(doctor.getField());
		doctorDataBase.setImg(doctor.getImg());
		doctorDataBase.setName(doctor.getName());
		doctorDataBase.setSpecialist(doctor.getSpecialist());
		
		doctorInt.saveDoctor(doctorDataBase);
		
		return ResponseEntity.ok(true);
		
	}
	
	
	@GetMapping("getDoctor")
	public ResponseEntity<Doctors> upadateDoctors(@RequestParam int id )
	{
		Doctors doctor=doctorInt.getDoctor(id);
			return ResponseEntity.ok(doctor);
	}
	
	@PostMapping("saveDoctor")
	public ResponseEntity<Boolean> saveDoctors(@RequestBody Doctors doctor )
	{
		Doctors obj=doctorInt.saveDoctor(doctor);
		if(obj==null)
		{
			return ResponseEntity.ok(false);
		}
		else
		{
			return ResponseEntity.ok(true);
		}
	}
	
	@GetMapping("getAllSymptoms")
	public ResponseEntity<List<String>> getAllSymptomps()
	{
		List<Doctors> doctors= doctorInt.getAllDoctors();
		List<String> sysptopmps=new ArrayList<>();
		for(Doctors doctor:doctors)
		{
			String [] arr=doctor.getField().split("\\*");
			for(String symp:arr)
			{
				sysptopmps.add(symp);
			}
		}
		ResponseEntity<List<String>> data=ResponseEntity.ok(sysptopmps);
		return data;
		
	}
	
	
	@GetMapping("getSuggestionDoctor")
	public ResponseEntity<List<Doctors> > getSuggesionDoctorAccToSymptomps(@RequestParam String symptomp)
	{
		List<Doctors> doctors= doctorInt.getAllDoctors();
		List<Doctors> suggestionDoctors=new ArrayList<>();
		for(Doctors doctor:doctors)
		{
			String [] arr=doctor.getField().split("\\*");
			for(String symp:arr)
			{
				if(symptomp.equals(symp))
				{
					suggestionDoctors.add(doctor);
					break;
				}
			}
		}
		ResponseEntity<List<Doctors> > data=ResponseEntity.ok(suggestionDoctors);
		return data;
		
	}
	
}
