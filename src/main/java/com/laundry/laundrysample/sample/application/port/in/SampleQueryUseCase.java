package com.laundry.laundrysample.sample.application.port.in;

import com.laundry.laundrysample.sample.application.model.SampleFilter;
import com.laundry.laundrysample.sample.application.model.SampleQuery;
import com.laundry.laundrysample.sample.domain.SampleId;
import lombok.NonNull;

import java.util.List;

public interface SampleQueryUseCase {
    SampleQuery findSampleBySampleId(@NonNull SampleId sampleId);

    List<SampleQuery> findSamples(@NonNull SampleFilter sampleFilter);
}
