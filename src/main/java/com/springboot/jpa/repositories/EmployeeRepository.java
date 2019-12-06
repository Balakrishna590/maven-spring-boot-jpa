/**
 * 
 */
package com.springboot.jpa.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springboot.jpa.empdept.entites.EmployeeEntity;

/**
 * @author broutu
 *
 */
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Integer> {

}
