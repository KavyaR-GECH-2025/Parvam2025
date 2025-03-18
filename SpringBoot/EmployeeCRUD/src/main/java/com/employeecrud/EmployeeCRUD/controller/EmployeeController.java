package com.employeecrud.EmployeeCRUD.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.employeecrud.EmployeeCRUD.DTO.EmployeeDTO;
import com.employeecrud.EmployeeCRUD.models.Employee;
import com.employeecrud.EmployeeCRUD.service.EmployeeService;

@Controller
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // Get list of employees
    @GetMapping("/employees")
    public String getAllEmployees(Model model) {
        List<Employee> employees = employeeService.getAllEmployees();
        model.addAttribute("employees", employees);
        return "employees"; // Ensure employees.html exists in templates
    }

    // Show add employee form
    @GetMapping("/add-employee")
    public String addEmployee(Model model) {
        model.addAttribute("employeeDTO", new EmployeeDTO());
        return "add_employee"; // Ensure add_employee.html exists in templates
    }

    // Save new employee
    @PostMapping("/add-employee")
    public String saveEmployee(@ModelAttribute("employeeDTO") EmployeeDTO employeeDTO) {
        employeeService.saveEmployee(employeeDTO);
        return "redirect:/employees";
    }

    // Show edit employee form
    @GetMapping("/edit-employee")
    public String getEmployee(@RequestParam("id") Long id, Model model) {
        Employee employee = employeeService.getEmployee(id);
        if (employee == null) {
            return "redirect:/employees?error=notfound"; // Handle missing employee case
        }
        
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setfName(employee.getfName());
        employeeDTO.setlName(employee.getlName());
        employeeDTO.setEmail(employee.getEmail());
        employeeDTO.setPhone(employee.getPhone());
        employeeDTO.setAddress(employee.getAddress());
        employeeDTO.setDepartment(employee.getDepartment());
        employeeDTO.setSalary(employee.getSalary());

        model.addAttribute("employeeDTO", employeeDTO);
        model.addAttribute("employee", employee);
        return "edit_employee"; // Ensure edit_employee.html exists in templates
    }

    // Update employee
    @PostMapping("/edit-employee")
    public String updateEmployee(@ModelAttribute("employeeDTO") EmployeeDTO employeeDTO, @RequestParam("id") Long id) {
        employeeService.updateEmployee(employeeDTO, id);
        return "redirect:/employees";
    }

    // Delete employee
    @GetMapping("/delete-employee")
    public String deleteEmployee(@RequestParam("id") Long id) {
        employeeService.deleteEmployee(id);
        return "redirect:/employees";
    }
}
