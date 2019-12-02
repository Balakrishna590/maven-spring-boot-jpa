/**
 * 
 */
package com.springboot.jpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.many2one.response.models.DepartmentM2OResponse;
import com.springboot.jpa.many2one.response.models.EmployeeM2OResponse;
import com.springboot.jpa.one2many.response.models.DepartmentO2MResponse;
import com.springboot.jpa.service.DepartmentService;
import com.springboot.jpa.service.EmployeeService;

/**
 * @author broutu
 *
 */
@RestController
@RequestMapping("/getAll")
public class EmployeeDeptController {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private DepartmentService departmentService;

	/*
	 * @RequestMapping("/depts") public List<DepartmentM2OResponse> getAllDepts() {
	 * return departmentService.getAllDepts(); }
	 */

	@RequestMapping("/employees-with-depts-M2O")
	public List<EmployeeM2OResponse> findAllEmployeesWithDeptsUsingM2O() {
		return employeeService.findAllEmployeesWithDeptsUsingM2O();
	}

	@RequestMapping("/employees-with-depts-O2M")
	public List<DepartmentO2MResponse> findAllEmployeesWithDeptsUsingO2M() {
		return departmentService.findAllEmployeesWithDeptsUsingO2M();
	}
}
