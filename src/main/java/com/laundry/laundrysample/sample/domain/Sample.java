package com.laundry.laundrysample.sample.domain;

import com.laundry.laundrysample.common.constant.type.YNType;
import com.laundry.laundrysample.sample.application.model.CreateSampleCommand;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class Sample {
    private SampleId sampleId;
    private String title;
    private String contents;
    private int ordinal;
    private YNType useYn;
    private Integer creator;
    private Integer lastModifier;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static Sample create(CreateSampleCommand createSampleCommand) {
        return Sample.builder()
                .title(createSampleCommand.getTitle())
                .contents(createSampleCommand.getContents())
                .useYn(YNType.Y)
                .creator(createSampleCommand.getCreator())
                .build();
    }

}

