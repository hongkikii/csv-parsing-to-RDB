package com.example.csvParsingToDb.config;

import com.example.csvParsingToDb.dto.HealthCsvData;
import com.example.csvParsingToDb.entity.Health;
import com.example.csvParsingToDb.repository.HealthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

@Configuration
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CsvScheduleWriter implements ItemWriter<HealthCsvData> {

    private final HealthRepository healthRepository;

    @Override
    @Transactional
    public void write(Chunk<? extends HealthCsvData> chunk) throws Exception {
        Chunk<Health> healths = new Chunk<>();

        chunk.forEach(healthCsvData -> {
            Health health = healthCsvData.toEntity();
            healths.add(health);
        });
        healthRepository.saveAll(healths);
    }
}
