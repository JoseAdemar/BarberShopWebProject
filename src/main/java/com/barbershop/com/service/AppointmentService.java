package com.barbershop.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barbershop.com.model.Appointment;
import com.barbershop.com.repository.AppointmentRepository;

@Service
public class AppointmentService {

	@Autowired
	private AppointmentRepository appointmentRepository;
	
	
	 public void saveAppointment(Appointment appointment) {
		 
		   appointmentRepository.save(appointment);
	 }
	 
	 public List<Appointment> listService(){
		 
		 return appointmentRepository.findAll();
	 }
}
