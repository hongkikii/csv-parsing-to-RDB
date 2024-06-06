package com.example.csvParsingToDb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Health {
    @Id @GeneratedValue
    private Long id;
    private String year;
    private String serialNumber;
    private String cityCode;
    private String gender;
    private String ageCode;
    private String height;
    private String weight;
    private String waistLine;
    private String leftVision;
    private String rightVision;
    private String leftHearing;
    private String rightHearing;
    private String systolicBloodPressure;
    private String diastolicBloodPressure;
    private String fastingBloodGlucose;
    private String TC;
    private String TG;
    private String HDL;
    private String LDL;
    private String hemoglobin;
    private String urinProtein;
    private String serumCreatinine;
    private String AST;
    private String ALT;
    private String GGT;
    private String smokingStatus;
    private String drinkingStatus;
    private String oralExamStatus;
    private String dentalCariesStatus;
    private String tartar;
}
