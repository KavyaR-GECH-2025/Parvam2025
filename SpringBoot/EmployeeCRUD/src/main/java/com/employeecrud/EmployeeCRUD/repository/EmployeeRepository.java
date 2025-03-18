package com.employeecrud.EmployeeCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.employeecrud.EmployeeCRUD.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
