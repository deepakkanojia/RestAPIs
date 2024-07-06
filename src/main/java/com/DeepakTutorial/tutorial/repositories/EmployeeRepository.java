package com.DeepakTutorial.tutorial.repositories;

import com.DeepakTutorial.tutorial.entities.EmployeeEntitiy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntitiy,Long> {
}