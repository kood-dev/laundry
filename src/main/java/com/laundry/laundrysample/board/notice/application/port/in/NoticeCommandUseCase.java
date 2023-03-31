package com.laundry.laundrysample.board.notice.application.port.in;

import com.laundry.laundrysample.board.notice.application.model.CreateNoticeCommand;
import com.laundry.laundrysample.board.notice.domain.NoticeId;
import com.laundry.laundrysample.common.anotation.UseCase;

public interface NoticeCommandUseCase {
    NoticeId createNotice(CreateNoticeCommand command);
}
