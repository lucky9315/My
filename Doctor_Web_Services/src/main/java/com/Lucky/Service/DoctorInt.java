package com.Lucky.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.Lucky.Model.Doctors;


public interface DoctorInt 
{

	public abstract List<Doctors> getAllDoctors();

	public abstract Doctors getDoctor(int id);
	public abstract void deleteDoctor(int id);

	public abstract Doctors saveDoctor(Doctors doctor);
	
}
