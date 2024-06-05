package com.example.csvParsingToDb.dto;

import com.example.csvParsingToDb.entity.Health;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class HealthCsvData {
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

    public static List<String> getFieldsNames() {
        Field[] declaredFields = HealthCsvData.class.getDeclaredFields();
        List<String> fieldNames = new ArrayList<>();
        for(Field declaredField : declaredFields) {
            fieldNames.add(declaredField.getName());
        }
        return fieldNames;
    }

    public Health toEntity() {
        return Health.builder()
                .year(year)
                .serialNumber(serialNumber)
                .cityCode(cityCode)
                .gender(gender)
                .ageCode(ageCode)
                .height(height)
                .weight(weight)
                .waistLine(waistLine)
                .leftVision(leftVision)
                .rightVision(rightVision)
                .leftHearing(leftHearing)
                .rightHearing(rightHearing)
                .systolicBloodPressure(systolicBloodPressure)
                .diastolicBloodPressure(diastolicBloodPressure)
                .fastingBloodGlucose(fastingBloodGlucose)
                .TC(TC)
                .TG(TG)
                .HDL(HDL)
                .LDL(LDL)
                .hemoglobin(hemoglobin)
                .urinProtein(urinProtein)
                .serumCreatinine(serumCreatinine)
                .AST(AST)
                .ALT(ALT)
                .GGT(GGT)
                .smokingStatus(smokingStatus)
                .drinkingStatus(drinkingStatus)
                .oralExamStatus(oralExamStatus)
                .dentalCariesStatus(dentalCariesStatus)
                .tartar(tartar)
                .build();
    }
}
