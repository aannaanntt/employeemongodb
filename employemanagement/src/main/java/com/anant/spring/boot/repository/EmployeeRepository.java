package com.anant.spring.boot.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.anant.spring.boot.entity.Employee;




public interface EmployeeRepository extends MongoRepository<Employee, String> {
	 Optional<Employee> findByUsername(String username);
	    Optional<Employee> findById(int id);
}
