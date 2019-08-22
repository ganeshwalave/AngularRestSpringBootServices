package com.persistent.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.persistent.model.Employee;

@Service
public class EmployeeService {

	Map<String, Employee> empMap = new HashMap<String, Employee>();
	
	public Map<String, Employee> createEmployee(){
		Employee employee = new Employee();
		employee.setEmpId("100");
		employee.setName("Amit Bhagwat");
		employee.setDesignation("Domain Lead");
		employee.setSalary(30000.50);
		empMap.put("1",employee);
		
		employee = new Employee();
		employee.setEmpId("200");
		employee.setName("Rohit Joshi");
		employee.setDesignation("Engineering Lead");
		employee.setSalary(10000.50);
		empMap.put("2", employee);
		
		employee = new Employee();
		employee.setEmpId("300");
		employee.setName("Deepak Jain");
		employee.setDesignation("PMO Lead");
		employee.setSalary(20000);
		empMap.put("3",employee);
		
		return empMap;
		
	}
	
	public Employee getEmployeeById(String empId){
		if(null!=empId && empMap.containsKey(empId))		
			return empMap.get(empId);
		else
			return null;
		
	}
}
