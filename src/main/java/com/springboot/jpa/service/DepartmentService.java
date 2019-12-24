/**
 * 
 */
package com.springboot.jpa.service;

import java.util.List;

import com.springboot.jpa.empdept.response.models.DepartmentResponse;
import com.springboot.jpa.one2manybi.response.models.DepartmentO2MBiResponse;
import com.springboot.jpa.one2manyuni.response.models.DepartmentO2MUniResponse;

/**
 * @author broutu
 *
 */
public interface DepartmentService {

	public List<DepartmentResponse> getAllDepts();

	public List<DepartmentO2MBiResponse> findAllEmployeesWithDeptsUsingO2MBiDi();
	
	public List<DepartmentO2MUniResponse> findAllEmployeesWithDeptsUsingO2MUniDi();

}
