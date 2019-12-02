/**
 * 
 */
package com.springboot.jpa.service;

import java.util.List;

import com.springboot.jpa.many2one.response.models.EmployeeM2OResponse;

/**
 * @author broutu
 *
 */
public interface EmployeeService {

	public List<EmployeeM2OResponse> findAllEmployeesWithDeptsUsingM2O();
}
