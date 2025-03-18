package com.employeecrud.EmployeeCRUD.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.employeecrud.EmployeeCRUD.DTO.EmployeeDTO;
import com.employeecrud.EmployeeCRUD.models.Employee;
import com.employeecrud.EmployeeCRUD.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // Get list of employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Save employee
    public void saveEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setfName(employeeDTO.getfName());
        employee.setlName(employeeDTO.getlName());
        employee.setEmail(employeeDTO.getEmail());
        employee.setPhone(employeeDTO.getPhone());
        employee.setAddress(employeeDTO.getAddress());
        employee.setDepartment(employeeDTO.getDepartment());
        employee.setSalary(employeeDTO.getSalary());
        employeeRepository.save(employee);
    }

    // Get employee by ID
    public Employee getEmployee(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with ID: " + id));
    }

    // Update employee
    public void updateEmployee(EmployeeDTO employeeDTO, Long id) {
        Employee employee = getEmployee(id); // Ensure employee exists
        employee.setfName(employeeDTO.getfName());
        employee.setlName(employeeDTO.getlName());
        employee.setEmail(employeeDTO.getEmail());
        employee.setPhone(employeeDTO.getPhone());
        employee.setAddress(employeeDTO.getAddress());
        employee.setDepartment(employeeDTO.getDepartment());
        employee.setSalary(employeeDTO.getSalary());
        employeeRepository.save(employee);
    }

    // Delete employee
    public void deleteEmployee(Long id) {
        if (!employeeRepository.existsById(id)) {
            throw new RuntimeException("Employee not found with ID: " + id);
        }
        employeeRepository.deleteById(id);
    }
}
