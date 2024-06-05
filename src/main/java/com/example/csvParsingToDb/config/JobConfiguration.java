package com.example.csvParsingToDb.config;

import com.example.csvParsingToDb.dto.HealthCsvData;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@RequiredArgsConstructor
public class JobConfiguration {
    private final CsvReader csvReader;
    private final CsvScheduleWriter csvScheduleWriter;

    @Bean
    public Job healthDataLoadJob(JobRepository jobRepository, Step healthDataLoadStep) {
        return new JobBuilder("HealthDataLoadJob", jobRepository)
                .start(healthDataLoadStep)
                .build();
    }

    @Bean
    public Step healthDataLoadStep(JobRepository jobRepository,
                                   PlatformTransactionManager platformTransactionManager) {
        return new StepBuilder("healthDataLoadStep", jobRepository)
                .<HealthCsvData, HealthCsvData>chunk(100, platformTransactionManager)
                .reader(csvReader.csvScheduleReader())
                .writer(csvScheduleWriter)
                .build();
    }
}
