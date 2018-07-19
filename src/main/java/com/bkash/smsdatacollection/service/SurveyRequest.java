package com.bkash.smsdatacollection.service;

import lombok.Data;

@Data
public class SurveyRequest {
    private String simId;
    private String phoneNumber;
    private String name;

}
