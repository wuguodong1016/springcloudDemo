package com.wugd.springcloud.dao;

import com.wugd.springcloud.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long>{

}
