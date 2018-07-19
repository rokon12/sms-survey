package com.bkash.smsdatacollection.config.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class SurveyResult implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Version
    private Long version;

    protected String device;
    protected String model;
    protected Integer sdk;
    protected String product;
    protected String display;
    protected String manufacturer;
    protected String brand;
    protected String type;
    protected String number;
    protected String status;
    protected String osVersion;
    protected Date time;
    protected String career;
    public String serial;
}