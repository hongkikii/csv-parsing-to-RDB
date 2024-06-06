package com.example.csvParsingToDb.config;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

class CsvReaderTest {

    @Test
    public void csv_파일이_정상적으로_존재한다() {
        try {
            ClassPathResource resource = new ClassPathResource("data/health.csv");
            assertTrue(resource.exists(), "CSV 파일이 존재해야 합니다.");

            BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream()));
            String line;
            boolean hasContent = false;
            while ((line = br.readLine()) != null) {
                hasContent = true;
                System.out.println(line);
            }
            assertTrue(hasContent, "CSV 파일에 내용이 있어야 합니다.");
        }
        catch (Exception e) {
            e.printStackTrace();
            assertNotNull(null, "예외가 발생하면 안 됩니다.");
        }
    }
}
