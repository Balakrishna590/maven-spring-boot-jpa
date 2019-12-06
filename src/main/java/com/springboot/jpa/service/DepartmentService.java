/**
 * 
 */
package com.springboot.jpa.service;

import java.util.List;

import com.springboot.jpa.empdept.response.models.DepartmentResponse;
import com.springboot.jpa.one2many.response.models.DepartmentO2MResponse;

/**
 * @author broutu
 *
 */
public interface DepartmentService {

	public List<DepartmentResponse> getAllDepts();

	public List<DepartmentO2MResponse> findAllEmployeesWithDeptsUsingO2M();

}
