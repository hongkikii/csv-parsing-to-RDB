package com.example.csvParsingToDb.dto;

import com.example.csvParsingToDb.entity.Health;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HealthCsvData {
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
