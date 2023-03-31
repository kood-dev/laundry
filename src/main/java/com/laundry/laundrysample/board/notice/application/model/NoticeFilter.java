package com.laundry.laundrysample.board.notice.application.model;

import com.laundry.laundrysample.common.constant.type.YNType;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
public class NoticeFilter {
    private String title;
    @Builder.Default
    private YNType useYn = YNType.Y;
}
