package com.me.service;

import java.util.List;

import com.me.entity.Doctor;
import com.me.exception.DoctorNotFoundException;

public interface DoctorService {
	public Doctor registerDoctor(Doctor doctor);
	public Doctor updateDoctor(Doctor doctor);
	public Doctor deleteDoctor(int docid) throws DoctorNotFoundException;
	public Doctor getDoctor(int docid) throws DoctorNotFoundException;
	public List<Doctor> getDoctor();
}