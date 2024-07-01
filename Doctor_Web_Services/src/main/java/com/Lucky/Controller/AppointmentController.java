package com.Lucky.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Lucky.Model.Appointments;
import com.Lucky.Service.AppointmentInt;

import jakarta.validation.Valid;

@RestController
@CrossOrigin
//@RequestMapping("doctor")
public class AppointmentController 
{
	@Autowired
	private AppointmentInt appointmentInt;
	
	
	@PostMapping("bookAppointment")
	public ResponseEntity<Appointments> saveAppointment(@Valid @RequestBody Appointments appointment)
	{
//		System.out.println("here");
		Appointments appointments2=appointmentInt.bookAppointment(appointment);
		ResponseEntity<Appointments> entity=ResponseEntity.ok(appointments2);
		return entity;
	}
}
