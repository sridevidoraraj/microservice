package com.example.department.controller;


import com.example.department.entity.Department;
import com.example.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;



    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Optional<Department> findDepartmentById(@PathVariable("id") Long id){
        return departmentService.findDepartmentById(id);
    }
}
