package com.DeepakTutorial.tutorial.services;

import com.DeepakTutorial.tutorial.dto.EmployeeDTO;
import com.DeepakTutorial.tutorial.entities.EmployeeEntitiy;
import com.DeepakTutorial.tutorial.repositories.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    final EmployeeRepository employeeRepository;
    final ModelMapper modelMapper;

    public EmployeeService(EmployeeRepository employeeRepository, ModelMapper modelMapper){
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    public EmployeeDTO getEmployeeById(Long id){
        EmployeeEntitiy employeeEntitiy = employeeRepository.getById(id);
        return modelMapper.map(employeeEntitiy,EmployeeDTO.class);
    }

    public EmployeeDTO createNewEmployee(EmployeeDTO employeeDTO) {
        EmployeeEntitiy employeeEntitiy = modelMapper.map(employeeDTO,EmployeeEntitiy.class);
        return modelMapper.map(employeeRepository.save(employeeEntitiy),EmployeeDTO.class);
    }

    public List<EmployeeDTO> getAllEmployee() {
       return employeeRepository.findAll().stream().map(employeeEntitiy -> modelMapper.map(employeeEntitiy,EmployeeDTO.class)).collect(Collectors.toList());
    }
}
