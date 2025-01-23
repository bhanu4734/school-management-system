package com.schoolmanagement.service;

import com.schoolmanagement.model.Class;
import com.schoolmanagement.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {
    @Autowired
    private ClassRepository classRepository;

    public List<Class> getAllClasses() {
        return classRepository.findAll();
    }

    public Class saveClass(Class schoolClass) {
        return classRepository.save(schoolClass);
    }

    public void deleteClass(Long id) {
        classRepository.deleteById(id);
    }
}
