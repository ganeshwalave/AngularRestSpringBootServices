package com.persistent.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persistent.model.Employee;
import com.persistent.service.EmployeeService;

@RestController
@CrossOrigin("*")
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/all")
	public List<Employee> getAllEmployee(){
		Map<String, Employee> map = employeeService.createEmployee();
		List<Employee> empList = new ArrayList<Employee>();
		for(Entry<String, Employee> st :map.entrySet()) {
			empList.add(st.getValue());
		}
		return empList;
	}
	
	@RequestMapping("{id}")
	public Employee getAllEmployee(@PathVariable("id") String id){
		return employeeService.getEmployeeById(id);
	}
	
}
