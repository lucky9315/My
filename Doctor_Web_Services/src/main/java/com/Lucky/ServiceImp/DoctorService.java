package com.Lucky.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Lucky.Model.Doctors;
import com.Lucky.Repository.DoctorRepo;
import com.Lucky.Service.DoctorInt;

@Service
public class DoctorService implements DoctorInt
{
	@Autowired
	private DoctorRepo doctorRepo;
	public List<Doctors> getAllDoctors() 
	{
		return doctorRepo.getAllDoctors();
	}
	@Override
	public Doctors getDoctor(int id) 
	{
		Doctors doctor=doctorRepo.findById(id).orElse(null);
		return doctor;
	}
	
	public void deleteDoctor(int id) 
	{
		doctorRepo.deleteById(id);
	}
	public Doctors saveDoctor(Doctors doctor) 
	{
		return doctorRepo.save(doctor);
	}
		
}
