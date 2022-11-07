package com.cg.deptemp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.deptemp.entities.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
