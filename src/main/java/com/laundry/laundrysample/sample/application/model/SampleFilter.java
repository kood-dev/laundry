package com.laundry.laundrysample.sample.application.model;

import com.laundry.laundrysample.common.constant.type.YNType;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
public class SampleFilter {
    private String title;
    @Builder.Default
    private YNType useYn = YNType.Y;
}
