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
    private Integer year;
    private Integer serialNumber;
    private Integer cityCode;
    private Integer gender;
    private Integer ageCode;
    private Integer height;
    private Integer weight;
    private Float waistLine;
    private Float leftVision;
    private Float rightVision;
    private Float leftHearing;
    private Float rightHearing;
    private Integer systolicBloodPressure;
    private Integer diastolicBloodPressure;
    private Integer fastingBloodGlucose;
    private Integer TC;
    private Integer TG;
    private Integer HDL;
    private Integer LDL;
    private Integer hemoglobin;
    private Integer urinProtein;
    private Integer serumCreatinine;
    private Integer AST;
    private Integer ALT;
    private Integer GGT;
    private Integer smokingStatus;
    private Integer drinkingStatus;
    private Integer oralExamStatus;
    private Integer dentalCariesStatus;
    private Integer tartar;
}
