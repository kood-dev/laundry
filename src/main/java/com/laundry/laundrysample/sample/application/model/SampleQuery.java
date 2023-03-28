package com.laundry.laundrysample.sample.application.model;

import com.laundry.laundrysample.common.constant.type.YNType;
import com.laundry.laundrysample.sample.domain.Sample;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class SampleQuery {
    private final Long sampleId;
    private final String title;
    private final String contents;
    private final int ordinal;
    private final YNType useYn;
    private final Integer creator;
    private final LocalDateTime createdAt;

    public static SampleQuery of(Sample sample) {
        return SampleQuery.builder()
                .sampleId(sample.getSampleId().value())
                .title(sample.getTitle())
                .contents(sample.getContents())
                .ordinal(sample.getOrdinal())
                .useYn(sample.getUseYn())
                .creator(sample.getCreator())
                .createdAt(sample.getCreatedAt())
                .build();
    }
}
