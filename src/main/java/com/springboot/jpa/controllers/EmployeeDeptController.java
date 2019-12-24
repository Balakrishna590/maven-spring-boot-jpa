/**
 * 
 */
package com.springboot.jpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.empdept.response.models.DepartmentResponse;
import com.springboot.jpa.many2one.response.models.EmployeeM2OResponse;
import com.springboot.jpa.one2manybi.response.models.DepartmentO2MBiResponse;
import com.springboot.jpa.one2manyuni.response.models.DepartmentO2MUniResponse;
import com.springboot.jpa.service.DepartmentService;
import com.springboot.jpa.service.EmployeeService;

/**
 * @author broutu
 *
 */
@RestController
@CrossOrigin(origins = "http://localhost:8090")
@RequestMapping("/getAll")
public class EmployeeDeptController {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private DepartmentService departmentService;

	@RequestMapping("/depts")
	public List<DepartmentResponse> getAllDepts() {
		return departmentService.getAllDepts();
	}

	@RequestMapping("/employees-with-depts-M2O")
	public List<EmployeeM2OResponse> findAllEmployeesWithDeptsUsingM2O() {
		return employeeService.findAllEmployeesWithDeptsUsingM2O();
	}

	@RequestMapping("/employees-with-depts-O2MBidirectional")
	public List<DepartmentO2MBiResponse> findAllEmployeesWithDeptsUsingO2MBiDi() {
		return departmentService.findAllEmployeesWithDeptsUsingO2MBiDi();
	}
	
	@RequestMapping("/employees-with-depts-O2MUnidirectional")
	public List<DepartmentO2MUniResponse> findAllEmployeesWithDeptsUsingO2MUniDi() {
		return departmentService.findAllEmployeesWithDeptsUsingO2MUniDi();
	}
}
