package com.laundry.laundrysample.board.notice.application.model;

import com.laundry.laundrysample.common.constant.type.YNType;
import lombok.Builder;
import lombok.NonNull;

@Builder
public class CreateNoticeCommand {
    @NonNull
    private String title;
    private String contents;
    private int ordinal;
    private YNType useYn;
}
