package com.Lucky.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Appointments 
{		
		@Id
		@SequenceGenerator(initialValue = 1000000,allocationSize = 1,name = "token")
		@GeneratedValue(generator = "token")
		private int tokenNo;
		
		@NotBlank(message = "name does not null")
		private String name;
		
		@Email(message = "please enter a valid email id")
		private String email;
		
		@NotNull(message = "please enter a valid symptomp")
		private String symp;
		
		private String phone;
		
		@NotNull(message = "please enter a doctor name")
		private String doctorName;
		
		@NotNull(message = "please enter a date")
		private String date;
		
		@NotNull(message = "please enter a time")
		private String time;
		
		@NotNull(message = "please enter a problem")
		private String problem;
		public int getTokenNo() {
			return tokenNo;
		}
		public void setTokenNo(int tokenNo) {
			this.tokenNo = tokenNo;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmali(String email) {
			this.email = email;
		}
		public String getSymp() {
			return symp;
		}
		public void setSymp(String symp) {
			this.symp = symp;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getDoctorName() {
			return doctorName;
		}
		public void setDoctorName(String doctorName) {
			this.doctorName = doctorName;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
		public String getProblem() {
			return problem;
		}
		public void setProblem(String problem) {
			this.problem = problem;
		}
		@Override
		public String toString() {
			return "Appointments [tokenNo=" + tokenNo + ", name=" + name + ", email=" + email + ", symp=" + symp
					+ ", phone=" + phone + ", doctorName=" + doctorName + ", date=" + date + ", time=" + time
					+ ", problem=" + problem + "]";
		}
		
		
		
		
}
