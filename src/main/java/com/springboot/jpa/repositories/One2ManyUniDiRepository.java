/**
 * 
 */
package com.springboot.jpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.springboot.jpa.one2manyuni.entites.DepartmentO2MUniEntity;

/**
 * @author broutu
 *
 */
public interface One2ManyUniDiRepository extends CrudRepository<DepartmentO2MUniEntity, Long> {

	@Query("SELECT DE from DepartmentO2MUniEntity DE JOIN EmployeeO2MUniEntity EE WHERE DE.deptNo=" + 10)
	public List<DepartmentO2MUniEntity> findAllEmployeesWithDeptsUsingO2M();

}
