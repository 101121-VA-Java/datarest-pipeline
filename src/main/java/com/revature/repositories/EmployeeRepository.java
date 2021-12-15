package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.revature.models.Employee;

@RepositoryRestResource(path = "employees1")
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
