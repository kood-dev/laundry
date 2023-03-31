package com.laundry.laundrysample.board.notice.application.port.out;

import com.laundry.laundrysample.board.notice.application.model.CreateNoticeCommand;
import com.laundry.laundrysample.board.notice.domain.NoticeId;

public interface NoticePort {
    NoticeId createNotice(CreateNoticeCommand command);
}
