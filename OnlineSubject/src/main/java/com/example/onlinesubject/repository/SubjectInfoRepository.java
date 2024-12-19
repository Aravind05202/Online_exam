package com.example.onlinesubject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.onlinesubject.model.SubjectInfo;
import java.util.List;

public interface SubjectInfoRepository extends JpaRepository<SubjectInfo, String> {
    
    // Method to find subjects by class ID (assuming 'fk_class_id' column is named 'classid' in the database)
    List<SubjectInfo> findSubjectsByClassId(String classId);
}
