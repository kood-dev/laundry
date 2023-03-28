package com.laundry.laundrysample.sample.application.port.out;


import com.laundry.laundrysample.sample.application.model.SampleFilter;
import com.laundry.laundrysample.sample.domain.Sample;
import com.laundry.laundrysample.sample.domain.SampleId;

import java.util.List;

public interface SampleServicePort {
    SampleId createSample(Sample sample);

    Sample findBySampleId(SampleId sampleId);

    List<Sample> findSamples(SampleFilter sampleFilter);
}
