package com.siva.restexamples.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.siva.restexamples.crud.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}