package com.example.onlinesubject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinesubject.model.SubjectInfo;
import com.example.onlinesubject.repository.SubjectInfoRepository;

import java.util.List;

@Service
public class SubjectInfoService {

    @Autowired
    private SubjectInfoRepository subjectInfoRepository;

    /**
     * Fetches all subjects.
     *
     * @return a list of all subjects
     */
    public List<SubjectInfo> getAllSubjects() {
        return subjectInfoRepository.findAll(); // Returns all subjects
    }

    /**
     * Fetches subjects based on class ID.
     *
     * @param classId the class ID for which subjects are to be fetched
     * @return a list of subjects associated with the class ID
     */
    public List<SubjectInfo> getSubjectsByClassId(String classId) {
        return subjectInfoRepository.findSubjectsByClassId(classId);
    }
}
