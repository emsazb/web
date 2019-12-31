package com.djallil.ems.controller;


import com.djallil.ems.model.Employee;
import com.djallil.ems.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> get() {
        return employeeService.get();
    }

    @GetMapping("/employees/{id}")
    public Optional<Employee> getByID(@PathVariable(name = "id") int id) {
        return employeeService.get(id);
    }

    @PostMapping("/employees")
    public Employee save(@RequestBody Employee employee) {
        employeeService.save(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee update(@RequestBody Employee employee) {
        return save(employee);
    }

    @DeleteMapping("/employees")
    public int delete(@RequestParam int id) {
        employeeService.delete(id);
        return id;
    }
}
