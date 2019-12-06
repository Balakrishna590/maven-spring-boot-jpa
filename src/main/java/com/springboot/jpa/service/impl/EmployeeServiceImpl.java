package com.springboot.jpa.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jpa.many2one.entites.DepartmentM2OEntity;
import com.springboot.jpa.many2one.entites.EmployeeM2OEntity;
import com.springboot.jpa.many2one.response.models.DepartmentM2OResponse;
import com.springboot.jpa.many2one.response.models.EmployeeM2OResponse;
import com.springboot.jpa.repositories.EmployeeRepository;
import com.springboot.jpa.repositories.Many2OneRepository;
import com.springboot.jpa.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private Many2OneRepository many2OneRepository;

	@Override
	public List<EmployeeM2OResponse> findAllEmployeesWithDeptsUsingM2O() {
		List<EmployeeM2OEntity> employeeEntites = many2OneRepository.findAllEmployeesWithDeptsUsingM2O();
		return convertEEToER(employeeEntites);
	}

	private List<EmployeeM2OResponse> convertEEToER(List<EmployeeM2OEntity> employeeEntites) {
		List<EmployeeM2OResponse> listOfEmployees = new ArrayList<EmployeeM2OResponse>();
		for (EmployeeM2OEntity employeeEntity : employeeEntites) {
			EmployeeM2OResponse employeeResponse = new EmployeeM2OResponse();
			employeeResponse.setEmpNo(employeeEntity.getEmpNo());
			employeeResponse.setEname(employeeEntity.getEname());
			employeeResponse.setJob(employeeEntity.getJob());
			Integer mgrNo = employeeEntity.getMgr() == null ? null : employeeEntity.getMgr();
			employeeResponse.setMgr(mgrNo);
			employeeResponse.setHireDate(employeeEntity.getHireDate());
			employeeResponse.setSalary(employeeEntity.getSalary());
			Integer commession = employeeEntity.getCommession() == null ? null : employeeEntity.getCommession();
			employeeResponse.setCommession(commession);
			employeeResponse.setDepartmentResponse(convertDEToDR(employeeEntity.getDepartmentM2OEntity()));
			listOfEmployees.add(employeeResponse);
		}
		return listOfEmployees;
	}

	private DepartmentM2OResponse convertDEToDR(DepartmentM2OEntity departmentEntity) {
		DepartmentM2OResponse departmentResponse = new DepartmentM2OResponse();
		departmentResponse.setDeptNo(departmentEntity.getDeptNo());
		departmentResponse.setDname(departmentEntity.getDname());
		departmentResponse.setLocation(departmentEntity.getLocation());
		return departmentResponse;
	}
}
