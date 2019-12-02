package com.springboot.jpa.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jpa.many2one.entites.DepartmentM2OEntity;
import com.springboot.jpa.many2one.response.models.DepartmentM2OResponse;
import com.springboot.jpa.one2many.entites.DepartmentO2MEntity;
import com.springboot.jpa.one2many.entites.EmployeeO2MEntity;
import com.springboot.jpa.one2many.response.models.DepartmentO2MResponse;
import com.springboot.jpa.one2many.response.models.EmployeeO2MResponse;
import com.springboot.jpa.repositories.DepartmentRepository;
import com.springboot.jpa.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	/*
	 * @Override public List<DepartmentM2OResponse> getAllDepts() {
	 * List<DepartmentM2OEntity> departmentEntites = (List<DepartmentM2OEntity>)
	 * departmentRepository.findAll(); return convertListDEToDR(departmentEntites);
	 * }
	 */

	private List<DepartmentM2OResponse> convertListDEToDR(List<DepartmentM2OEntity> departmentEntites) {
		List<DepartmentM2OResponse> listOfDepartments = new ArrayList<>();
		for (DepartmentM2OEntity departmentEntity : departmentEntites) {
			DepartmentM2OResponse departmentResponse = new DepartmentM2OResponse();
			departmentResponse.setDeptNo(departmentEntity.getDeptNo());
			departmentResponse.setDname(departmentEntity.getDname());
			departmentResponse.setLocation(departmentEntity.getLocation());
			listOfDepartments.add(departmentResponse);
		}
		return listOfDepartments;
	}

	@Override
	public List<DepartmentO2MResponse> findAllEmployeesWithDeptsUsingO2M() {
		List<DepartmentO2MEntity> listOfDeptsWithEmps  =  departmentRepository.findAllEmployeesWithDeptsUsingO2M();
		return convertDEToDR(listOfDeptsWithEmps);
	}
	
	private List<DepartmentO2MResponse> convertDEToDR(List<DepartmentO2MEntity> listOfDeptsWithEmps){
		List<DepartmentO2MResponse> listOfDepartments = new ArrayList<DepartmentO2MResponse>();
		
		for (DepartmentO2MEntity departmentO2MEntity : listOfDeptsWithEmps) {
			DepartmentO2MResponse departmentO2MResponse = new DepartmentO2MResponse();
			departmentO2MResponse.setDeptNo(departmentO2MEntity.getDeptNo());
			departmentO2MResponse.setDname(departmentO2MEntity.getDname());
			departmentO2MResponse.setLocation(departmentO2MEntity.getLocation());
			departmentO2MResponse.setEmployeeO2MResponse(convertEEtoER(departmentO2MEntity.getEmployeeO2MEntites()));
		}
		return listOfDepartments;
	}
	
	private List<EmployeeO2MResponse> convertEEtoER(List<EmployeeO2MEntity> setofEmplyees){
		List<EmployeeO2MResponse> listOfEmplyees = new ArrayList<EmployeeO2MResponse>();
		for ( EmployeeO2MEntity employeeO2MEntity : setofEmplyees) {
			EmployeeO2MResponse employeeO2MResponse = new EmployeeO2MResponse();
			employeeO2MResponse.setEmpNo(employeeO2MEntity.getEmpNo());
			employeeO2MResponse.setEname(employeeO2MEntity.getEname());
			employeeO2MResponse.setJob(employeeO2MEntity.getJob());
			Integer mgrNo = employeeO2MEntity.getMgr()==null? null:employeeO2MEntity.getMgr();
			employeeO2MResponse.setMgr(mgrNo);
			employeeO2MResponse.setHireDate(employeeO2MEntity.getHireDate());
			employeeO2MResponse.setSalary(employeeO2MEntity.getSalary());
			Integer commession = employeeO2MEntity.getCommession()==null? null:employeeO2MEntity.getCommession();
			employeeO2MResponse.setCommession(commession);
			listOfEmplyees.add(employeeO2MResponse);
		}
		return listOfEmplyees;
	}
}
