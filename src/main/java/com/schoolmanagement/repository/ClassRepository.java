package com.schoolmanagement.repository;

import com.schoolmanagement.model.Class;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<Class, Long> {
}
