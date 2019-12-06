/**
 * 
 */
package com.springboot.jpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.springboot.jpa.one2many.entites.DepartmentO2MEntity;

/**
 * @author broutu
 *
 */
public interface One2ManyRepository extends CrudRepository<DepartmentO2MEntity, Long> {

	@Query("SELECT DE from EmployeeO2MEntity EE JOIN EE.departmentO2MEntity DE  WHERE EE.departmentO2MEntity.deptNo = "
			+ 10 + " and DE.deptNo=" + 10)
	public List<DepartmentO2MEntity> findAllEmployeesWithDeptsUsingO2M();

}
