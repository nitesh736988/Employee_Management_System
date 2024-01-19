package com.mydata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mydata.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

}
