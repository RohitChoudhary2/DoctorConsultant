package com.me.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.dao.DoctorRepository;
import com.me.entity.Doctor;
import com.me.exception.DoctorNotFoundException;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorRepository docRepo;
	
	@Override
	public Doctor registerDoctor(Doctor doctor) {
		return docRepo.save(doctor);
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		return docRepo.save(doctor);
	}

	@Override
	public Doctor deleteDoctor(int docid)  throws DoctorNotFoundException{
		Optional<Doctor> doctor = docRepo.findById(docid);
		
		Doctor doc = null;
		if(doctor.isPresent()) {
			docRepo.deleteById(docid);
			doc = doctor.get();
		}else {
			throw new DoctorNotFoundException("No such doctor");
		}
		return doc;
	}

	@Override
	public Doctor getDoctor(int docid)  throws DoctorNotFoundException{
		Optional<Doctor> doctor = docRepo.findById(docid);
		Doctor doc = null;
		if(doctor.isPresent()) {
			doc = doctor.get();
		}else {
			throw new DoctorNotFoundException("No such doctor");
		}
		return doc;
	}

	/*
	 * @Override public List<Doctor> getdoctor() { return docRepo.findAll(); }
	 */

	@Override
	public List<Doctor> getDoctor() {
		// TODO Auto-generated method stub
		return docRepo.findAll();
	}

	

/*
 * @Override public List<Doctor> getDoctor() { // TODO Auto-generated method
 * stub return null;  }
 */
}