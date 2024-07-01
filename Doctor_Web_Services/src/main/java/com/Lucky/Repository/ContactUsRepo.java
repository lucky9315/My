package com.Lucky.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Lucky.Model.ContactUs;

@Repository
public interface ContactUsRepo extends JpaRepository<ContactUs, Integer> 
{
		
}
