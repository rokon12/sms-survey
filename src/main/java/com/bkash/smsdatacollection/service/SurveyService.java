package com.bkash.smsdatacollection.service;

import com.bkash.smsdatacollection.config.domain.SurveyResult;
import com.bkash.smsdatacollection.repository.SurveyResultRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SurveyService {
    private final SurveyResultRepository resultRepository;

    public SurveyService(SurveyResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    public void saveSurveyResult(SurveyResult result) {
        resultRepository.save(result);
    }

    public List<SurveyResult> findAll() {
        return resultRepository.findAll();
    }

    public void update(SurveyResult surveyResult) {
        SurveyResult bySerial = resultRepository.findBySerial(surveyResult.getSerial());
        bySerial.setStatus("Successful");
        surveyResult.setNumber(surveyResult.getNumber());

        resultRepository.saveAndFlush(bySerial);
    }
}
