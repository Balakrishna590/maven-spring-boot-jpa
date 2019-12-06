/**
 * 
 */
package com.springboot.jpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.springboot.jpa.many2one.entites.EmployeeM2OEntity;

/**
 * @author broutu
 *
 */
public interface Many2OneRepository extends CrudRepository<EmployeeM2OEntity, Long> {

	@Query("SELECT  EE from EmployeeM2OEntity EE JOIN EE.departmentM2OEntity DE  WHERE EE.departmentM2OEntity.deptNo = DE.deptNo")
	public List<EmployeeM2OEntity> findAllEmployeesWithDeptsUsingM2O();
}
