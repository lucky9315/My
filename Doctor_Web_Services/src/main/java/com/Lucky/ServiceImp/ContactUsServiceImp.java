package com.Lucky.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Lucky.Model.ContactUs;
import com.Lucky.Repository.ContactUsRepo;
import com.Lucky.Service.ContactUsint;

@Service
public class ContactUsServiceImp implements ContactUsint
{
		@Autowired
		private ContactUsRepo contactUsRepo;
		public void recordComplaint(ContactUs contactUs) 
		{
			contactUsRepo.save(contactUs);
		}
}
