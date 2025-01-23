package com.schoolmanagement.controller;

import com.schoolmanagement.model.Class;
import com.schoolmanagement.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classes")
public class ClassController {
    @Autowired
    private ClassService classService;

    @GetMapping
    public List<Class> getAllClasses() {
        return classService.getAllClasses();
    }

    @PostMapping
    public Class saveClass(@RequestBody Class schoolClass) {
        return classService.saveClass(schoolClass);
    }

    @DeleteMapping("/{id}")
    public void deleteClass(@PathVariable Long id) {
        classService.deleteClass(id);
    }
}
