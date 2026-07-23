package com.klef.soa.service;

import java.util.List;

import com.klef.soa.entity.Doctor;

public interface DoctorService
{
	Doctor addDoctor(Doctor d);
	Doctor updaDoctor(Doctor d);
	List<Doctor> displayAllDoctors();
	
}
