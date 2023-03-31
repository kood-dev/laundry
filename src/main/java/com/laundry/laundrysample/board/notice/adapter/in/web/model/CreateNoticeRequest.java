package com.laundry.laundrysample.board.notice.adapter.in.web.model;

import com.laundry.laundrysample.board.notice.application.model.CreateNoticeCommand;
import com.laundry.laundrysample.common.constant.type.YNType;
import lombok.NonNull;

public class CreateNoticeRequest {
    @NonNull
    private String title;
    private String contents;
    private int ordinal;
    private YNType useYn = YNType.Y;

    public CreateNoticeCommand toCommand() {
        return CreateNoticeCommand.builder()
                .title(title)
                .contents(contents)
                .ordinal(ordinal)
                .useYn(useYn)
                .build();
    }
}
