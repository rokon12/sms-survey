package com.bkash.smsdatacollection.repository;

import com.bkash.smsdatacollection.config.domain.SurveyResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyResultRepository extends JpaRepository<SurveyResult, Long> {
    SurveyResult findBySerial(String serial);
}
