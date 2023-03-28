package com.laundry.laundrysample.sample.adapter.out.persistence;


import com.laundry.laundrysample.sample.application.model.SampleFilter;

import java.util.List;

interface QueryDslSampleRepository {
    List<SampleEntity> findSamples(SampleFilter sampleFilter);
}
