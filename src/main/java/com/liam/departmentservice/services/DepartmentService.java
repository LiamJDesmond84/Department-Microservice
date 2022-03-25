package com.liam.departmentservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liam.departmentservice.models.Department;
import com.liam.departmentservice.repositories.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepo;

	public Department createDepartment(Department department) {
		log.info("Service: Creating Department");
		return departmentRepo.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		log.info("Service: findById");
		return departmentRepo.findByDepartmentId(departmentId);
	}
	
	

}
