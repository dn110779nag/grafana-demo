package com.example.graphanademo;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;

@Component
public class MetricsGeneratorScheduler {
    private final MeterRegistry meterRegistry;
    private final Counter counter;

    private final SecureRandom secureRandom = new SecureRandom();

    public MetricsGeneratorScheduler(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
        counter = Counter.builder("myCounter")
                .tag("title", "cnt1")
                .register(meterRegistry);
    }

    @Scheduled(fixedDelay = 1_000)
    void runCycle() {
        int countMax = secureRandom.nextInt(10);
        counter.increment();
        for (int i = 0; i < countMax; i++) {
            counter.increment();
        }

    }
}
