package com.Lucky.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Lucky.Model.Appointments;
import com.Lucky.Repository.AppointmentRepo;
import com.Lucky.Service.AppointmentInt;

@Service
public class AppointmentServiceImp implements AppointmentInt
{
	@Autowired
	private AppointmentRepo appointmentRepo;

	@Override
	public Appointments bookAppointment(Appointments appointment) 
	{
		Appointments appointmentb=appointmentRepo.save(appointment);
		return appointmentb;
	}
}
