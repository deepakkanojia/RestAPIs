package com.DeepakTutorial.tutorial.controller;

//operations
//Get /employees
//Post /employees
//Delete /employees/{id}

import com.DeepakTutorial.tutorial.dto.EmployeeDTO;
import com.DeepakTutorial.tutorial.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable("id") Long emplid) {
        return employeeService.getEmployeeById(emplid);
    }
    @PostMapping
        public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.createNewEmployee(employeeDTO);
}
@GetMapping
    public List<EmployeeDTO> getAllEmployee(){
        return employeeService.getAllEmployee();

}
}