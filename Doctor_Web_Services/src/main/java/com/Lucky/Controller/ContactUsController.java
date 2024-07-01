package com.Lucky.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Lucky.Model.ContactUs;
import com.Lucky.Service.ContactUsint;

import jakarta.validation.Valid;

@RestController
@RequestMapping("contact")
@CrossOrigin
public class ContactUsController 
{
	@Autowired
	private ContactUsint contactUsint;
	
	@PostMapping("record")
	public void recordComplaint(@RequestBody ContactUs contactUs)
	{
		contactUsint.recordComplaint(contactUs);
	}
	
}
