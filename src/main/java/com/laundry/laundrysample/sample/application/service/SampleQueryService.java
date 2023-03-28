package com.laundry.laundrysample.sample.application.service;

import com.laundry.laundrysample.common.anotation.UseCase;
import com.laundry.laundrysample.sample.application.model.SampleFilter;
import com.laundry.laundrysample.sample.application.model.SampleQuery;
import com.laundry.laundrysample.sample.application.port.in.SampleQueryUseCase;
import com.laundry.laundrysample.sample.application.port.out.SampleServicePort;
import com.laundry.laundrysample.sample.domain.SampleId;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@UseCase
@Transactional(readOnly = true)
class SampleQueryService implements SampleQueryUseCase {
    private final SampleServicePort sampleServicePort;

    @Override
    public SampleQuery findSampleBySampleId(@NonNull SampleId sampleId) {
        return SampleQuery.of(sampleServicePort.findBySampleId(sampleId));
    }

    @Override
    public List<SampleQuery> findSamples(@NonNull SampleFilter sampleFilter) {
        return sampleServicePort.findSamples(sampleFilter).stream()
                .map(SampleQuery::of)
                .collect(Collectors.toList());
    }
}
