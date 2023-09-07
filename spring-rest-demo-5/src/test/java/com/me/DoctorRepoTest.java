package com.me;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.me.entity.Doctor;
import com.me.service.DoctorService;

@SpringBootTest
public class DoctorRepoTest {
	
	@MockBean
	private DoctorService doctorService;
	
	@Test
	public void testRegister() {
		Doctor doctor = new Doctor(2,"bvk","abc@gmail.com",12);
		
		Mockito.when(doctorService.registerDoctor(doctor)).thenReturn(doctor);
	}
	
	@Test
	public void testGet() {
		Doctor doctor = new Doctor(2,"bvk","abc@gmail.com",12);
		
		Mockito.when(doctorService.getDoctor(2)).thenReturn(doctor);
	}
}