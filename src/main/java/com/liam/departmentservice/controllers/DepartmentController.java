package com.liam.departmentservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liam.departmentservice.models.Department;
import com.liam.departmentservice.services.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentServ;

	@PostMapping("/create")
	public Department createDepartment(@RequestBody Department department) {
		log.info("Controller: Creating Department");
		return departmentServ.createDepartment(department);
	}
	
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") Long departmentId) {
		log.info("Controller: findById");
		return departmentServ.findDepartmentById(departmentId);
		
	}
	
}
