package com.laundry.laundrysample.sample.application.service;

import com.laundry.laundrysample.common.anotation.UseCase;
import com.laundry.laundrysample.sample.application.model.CreateSampleCommand;
import com.laundry.laundrysample.sample.application.port.in.SampleCommandUseCase;
import com.laundry.laundrysample.sample.application.port.out.SampleServicePort;
import com.laundry.laundrysample.sample.domain.Sample;
import com.laundry.laundrysample.sample.domain.SampleId;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@UseCase
@Transactional
class SampleCommandService implements SampleCommandUseCase {
    private final SampleServicePort samplePersistencePort;

    @Override
    public Long createSample(CreateSampleCommand createSampleCommand) {
        SampleId sampleId = samplePersistencePort.createSample(Sample.create(createSampleCommand));
        return sampleId.value();
    }
}
