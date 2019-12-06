package com.springboot.jpa.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springboot.jpa.empdept.entites.DepartmentEntity;

public interface DepartmentRepository extends CrudRepository<DepartmentEntity, Long> {

}
