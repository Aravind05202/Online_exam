package com.example.onlineclass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlineclass.model.ClassInfo;
import com.example.onlineclass.service.ClassInfoService;

import java.util.List;

@RestController // Use RestController for returning JSON responses
public class ClassController {

    @Autowired
    private ClassInfoService classInfoService;

    /**
     * API endpoint to fetch all classes in JSON format.
     */
    @GetMapping("/modify_question")
    public List<ClassInfo> getClassesAsJson() {
        // Fetch all classes and return as JSON
        return classInfoService.getAllClasses();
    }
}
