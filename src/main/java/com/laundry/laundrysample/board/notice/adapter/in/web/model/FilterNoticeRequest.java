package com.laundry.laundrysample.board.notice.adapter.in.web.model;

import com.laundry.laundrysample.board.notice.application.model.NoticeFilter;
import com.laundry.laundrysample.common.constant.type.YNType;

public class FilterNoticeRequest {
    private String title;

    private YNType useYn;

    public NoticeFilter toFilter() {
        return NoticeFilter.builder()
                .title(title)
                .useYn(useYn)
                .build();
    }
}
