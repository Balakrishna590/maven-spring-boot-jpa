package com.springboot.jpa.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jpa.empdept.entites.DepartmentEntity;
import com.springboot.jpa.empdept.response.models.DepartmentResponse;
import com.springboot.jpa.one2manybi.response.models.DepartmentO2MBiResponse;
import com.springboot.jpa.one2manybi.response.models.EmployeeO2MBiResponse;
import com.springboot.jpa.one2manybidi.entites.DepartmentO2MBiEntity;
import com.springboot.jpa.one2manybidi.entites.EmployeeO2MBiEntity;
import com.springboot.jpa.one2manyuni.entites.DepartmentO2MUniEntity;
import com.springboot.jpa.one2manyuni.entites.EmployeeO2MUniEntity;
import com.springboot.jpa.one2manyuni.response.models.DepartmentO2MUniResponse;
import com.springboot.jpa.one2manyuni.response.models.EmployeeO2MUniResponse;
import com.springboot.jpa.repositories.DepartmentRepository;
import com.springboot.jpa.repositories.One2ManyBiDiRepository;
import com.springboot.jpa.repositories.One2ManyUniDiRepository;
import com.springboot.jpa.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private One2ManyBiDiRepository one2ManyBiDiRepository;

	@Autowired
	private One2ManyUniDiRepository one2ManyUniDiRepository;

	@Override
	public List<DepartmentResponse> getAllDepts() {
		List<DepartmentEntity> departmentEntites = (List<DepartmentEntity>) departmentRepository.findAll();
		return convertListDEToDR(departmentEntites);
	}

	private List<DepartmentResponse> convertListDEToDR(List<DepartmentEntity> departmentEntites) {
		List<DepartmentResponse> listOfDepartments = new ArrayList<>();
		for (DepartmentEntity departmentEntity : departmentEntites) {
			DepartmentResponse departmentResponse = new DepartmentResponse();
			departmentResponse.setDeptNo(departmentEntity.getDeptNo());
			departmentResponse.setDname(departmentEntity.getDname());
			departmentResponse.setLocation(departmentEntity.getLocation());
			listOfDepartments.add(departmentResponse);
		}
		return listOfDepartments;
	}

	@Override
	public List<DepartmentO2MBiResponse> findAllEmployeesWithDeptsUsingO2MBiDi() {
		List<DepartmentO2MBiEntity> listOfDeptsWithEmps = one2ManyBiDiRepository.findAllEmployeesWithDeptsUsingO2M();
		// System.out.println(listOfDeptsWithEmps);
		return convertDEToDR(listOfDeptsWithEmps);
	}

	private List<DepartmentO2MBiResponse> convertDEToDR(List<DepartmentO2MBiEntity> listOfDeptsWithEmps) {
		List<DepartmentO2MBiResponse> listOfDepartments = new ArrayList<DepartmentO2MBiResponse>();

		for (DepartmentO2MBiEntity departmentO2MBiEntity : listOfDeptsWithEmps) {
			DepartmentO2MBiResponse departmentO2MBiResponse = new DepartmentO2MBiResponse();
			departmentO2MBiResponse.setDeptNo(departmentO2MBiEntity.getDeptNo());
			departmentO2MBiResponse.setDname(departmentO2MBiEntity.getDname());
			departmentO2MBiResponse.setLocation(departmentO2MBiEntity.getLocation());
			departmentO2MBiResponse
					.setEmployeeO2MBiResponse(convertEEtoER(departmentO2MBiEntity.getEmployeeO2MBiEntites()));
			listOfDepartments.add(departmentO2MBiResponse);
		}
		return listOfDepartments;
	}

	private List<EmployeeO2MBiResponse> convertEEtoER(List<EmployeeO2MBiEntity> setofEmplyees) {
		List<EmployeeO2MBiResponse> listOfEmplyees = new ArrayList<EmployeeO2MBiResponse>();
		for (EmployeeO2MBiEntity employeeO2MBiEntity : setofEmplyees) {
			EmployeeO2MBiResponse employeeO2MBiResponse = new EmployeeO2MBiResponse();
			employeeO2MBiResponse.setEmpNo(employeeO2MBiEntity.getEmpNo());
			employeeO2MBiResponse.setEname(employeeO2MBiEntity.getEname());
			employeeO2MBiResponse.setJob(employeeO2MBiEntity.getJob());
			Integer mgrNo = employeeO2MBiEntity.getMgr() == null ? null : employeeO2MBiEntity.getMgr();
			employeeO2MBiResponse.setMgr(mgrNo);
			employeeO2MBiResponse.setHireDate(employeeO2MBiEntity.getHireDate());
			employeeO2MBiResponse.setSalary(employeeO2MBiEntity.getSalary());
			Integer commession = employeeO2MBiEntity.getCommession() == null ? null
					: employeeO2MBiEntity.getCommession();
			employeeO2MBiResponse.setCommession(commession);
			employeeO2MBiResponse
					.setDepartmentO2MBiResponse(convertResDEToDR(employeeO2MBiEntity.getDepartmentO2MBiEntity()));
			listOfEmplyees.add(employeeO2MBiResponse);

		}
		return listOfEmplyees;
	}

	private DepartmentO2MBiResponse convertResDEToDR(DepartmentO2MBiEntity departmentO2MBiEntity) {
		DepartmentO2MBiResponse departmentO2MBiResponse = new DepartmentO2MBiResponse();
		departmentO2MBiResponse.setDeptNo(departmentO2MBiEntity.getDeptNo());
		departmentO2MBiResponse.setDname(departmentO2MBiEntity.getDname());
		departmentO2MBiResponse.setLocation(departmentO2MBiEntity.getLocation());
		return departmentO2MBiResponse;
	}

	@Override
	public List<DepartmentO2MUniResponse> findAllEmployeesWithDeptsUsingO2MUniDi() {
		// TODO Auto-generated method stub
		List<DepartmentO2MUniEntity> departmentO2MUniEntites = one2ManyUniDiRepository
				.findAllEmployeesWithDeptsUsingO2M();
		return convertDEToDRUni(departmentO2MUniEntites);
	}

	private List<DepartmentO2MUniResponse> convertDEToDRUni(List<DepartmentO2MUniEntity> departmentO2MUniEntites) {
		List<DepartmentO2MUniResponse> listOfDepartments = new ArrayList<DepartmentO2MUniResponse>();

		for (DepartmentO2MUniEntity departmentO2MUniEntity : departmentO2MUniEntites) {
			DepartmentO2MUniResponse departmentO2MUniResponse = new DepartmentO2MUniResponse();
			departmentO2MUniResponse.setDeptNo(departmentO2MUniEntity.getDeptNo());
			departmentO2MUniResponse.setDname(departmentO2MUniEntity.getDname());
			departmentO2MUniResponse.setLocation(departmentO2MUniEntity.getLocation());
			departmentO2MUniResponse.setEmployeeO2MUniResponse(
					convertEEtoERUniDirectional(departmentO2MUniEntity.getEmployeeO2MUniEntites()));
			listOfDepartments.add(departmentO2MUniResponse);
		}
		return listOfDepartments;
	}

	private List<EmployeeO2MUniResponse> convertEEtoERUniDirectional(List<EmployeeO2MUniEntity> setofEmplyees) {
		List<EmployeeO2MUniResponse> listOfEmplyees = new ArrayList<EmployeeO2MUniResponse>();
		for (EmployeeO2MUniEntity employeeO2MUniEntity : setofEmplyees) {
			EmployeeO2MUniResponse employeeO2MUniResponse = new EmployeeO2MUniResponse();
			employeeO2MUniResponse.setEmpNo(employeeO2MUniEntity.getEmpNo());
			employeeO2MUniResponse.setEname(employeeO2MUniEntity.getEname());
			employeeO2MUniResponse.setJob(employeeO2MUniEntity.getJob());
			Integer mgrNo = employeeO2MUniEntity.getMgr() == null ? null : employeeO2MUniEntity.getMgr();
			employeeO2MUniResponse.setMgr(mgrNo);
			employeeO2MUniResponse.setHireDate(employeeO2MUniEntity.getHireDate());
			employeeO2MUniResponse.setSalary(employeeO2MUniEntity.getSalary());
			Integer commession = employeeO2MUniEntity.getCommession() == null ? null
					: employeeO2MUniEntity.getCommession();
			employeeO2MUniResponse.setCommession(commession);
			listOfEmplyees.add(employeeO2MUniResponse);

		}
		return listOfEmplyees;
	}
}
