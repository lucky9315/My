package com.Lucky.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Lucky.Model.Appointments;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointments, Integer>
{
				
}
