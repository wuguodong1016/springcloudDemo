package com.wugd.springcloud.service;

import com.wugd.springcloud.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentService {

    Department saveDepartment(Department department);

    Department getDepartmentById(Long id);
}
