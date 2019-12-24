/**
 * 
 */
package com.springboot.jpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.springboot.jpa.one2manybidi.entites.DepartmentO2MBiEntity;

/**
 * @author broutu
 *
 */
public interface One2ManyBiDiRepository extends CrudRepository<DepartmentO2MBiEntity, Long> {

	@Query("SELECT DE from EmployeeO2MBiEntity EE JOIN EE.departmentO2MBiEntity DE  WHERE EE.departmentO2MBiEntity.deptNo = "
			+ 10 + " and DE.deptNo=" + 10)
	public List<DepartmentO2MBiEntity> findAllEmployeesWithDeptsUsingO2M();

}
