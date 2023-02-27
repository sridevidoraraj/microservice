package com.example.department.service;


import com.example.department.entity.Department;
import com.example.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public DepartmentService(DepartmentRepository repository) {
        this.repository = repository;
    }

    public Department saveDepartment(Department department){
        return repository.save(department);
    }

    public Optional<Department> findDepartmentById(Long id){
        return repository.findById(id);
    }
}
