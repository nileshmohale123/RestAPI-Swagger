package com.yash.com.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.com.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}