package com.laundry.laundrysample.sample.adapter.out.persistence;

import com.laundry.laundrysample.common.anotation.PersistenceAdapter;
import com.laundry.laundrysample.common.exception.ResultNotFoundException;
import com.laundry.laundrysample.sample.application.model.SampleFilter;
import com.laundry.laundrysample.sample.application.port.out.SampleServicePort;
import com.laundry.laundrysample.sample.domain.Sample;
import com.laundry.laundrysample.sample.domain.SampleId;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@PersistenceAdapter
@RequiredArgsConstructor
class SamplePersistenceAdapter implements SampleServicePort {
    private final SampleRepository sampleRepository;

    @Override
    public SampleId createSample(Sample sample) {
        SampleEntity sampleEntity = sampleRepository.save(toEntity(sample));
        return new SampleId(sampleEntity.getId());
    }

    @Override
    public Sample findBySampleId(SampleId sampleId) {
        return toDomain(sampleRepository.findById(sampleId.value()).orElseThrow(ResultNotFoundException::new));
    }

    @Override
    public List<Sample> findSamples(SampleFilter sampleFilter) {
        return sampleRepository.findSamples(sampleFilter).stream()
                .map(this::toDomain)
                .collect(Collectors.toList());
    }


    //TODO 각 entity, domain으로 전달은 계층 분리 이점을 버리는 것이기 때문에, 별도 Mapper를 두어서 convert 해야할 거 같다.
    private SampleEntity toEntity(Sample domain) {
        return new SampleEntity(
                domain.getSampleId() == null ? null : domain.getSampleId().value(),
                domain.getTitle(),
                domain.getContents(),
                domain.getOrdinal(),
                domain.getUseYn(),
                domain.getCreator(),
                domain.getLastModifier()
        );
    }

    private Sample toDomain(SampleEntity entity) {
        return Sample.builder()
                .sampleId(new SampleId(entity.getId()))
                .title(entity.getTitle())
                .contents(entity.getContents())
                .ordinal(entity.getOrdinal())
                .useYn(entity.getUseYn())
                .creator(entity.getCreator())
                .build();
    }
}
