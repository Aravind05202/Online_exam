package com.example.onlinesubject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

import com.example.onlinesubject.model.SubjectInfo;
import com.example.onlinesubject.service.SubjectInfoService;

import java.util.List;

@Controller
public class SubjectController {

    @Autowired
    private SubjectInfoService subjectInfoService;

    /**
     * Fetches subjects based on the selected class ID.
     */
    @GetMapping("/get-subjects")
    @ResponseBody
    public List<SubjectInfo> getSubjectsByClass(@RequestParam("class_id") String classId) {
        return subjectInfoService.getSubjectsByClassId(classId);
    }
}