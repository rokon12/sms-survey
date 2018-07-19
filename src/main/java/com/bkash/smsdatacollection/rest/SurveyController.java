package com.bkash.smsdatacollection.rest;

import com.bkash.smsdatacollection.config.domain.SurveyResult;
import com.bkash.smsdatacollection.service.SurveyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Slf4j
public class SurveyController {
    private final SurveyService service;

    public SurveyController(SurveyService service) {
        this.service = service;
    }

    @GetMapping("/data")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<SurveyResult> findAllData() {

        return service.findAll();
    }

    @PostMapping(value = "/init", consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.OK)
    public void init(@RequestBody SurveyResult surveyResult) {

        service.saveSurveyResult(surveyResult);
    }

    @PostMapping(value = "/send", consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.OK)
    public void saveInfo(@RequestBody SurveyResult surveyResult) {

        service.update(surveyResult);
    }
}
