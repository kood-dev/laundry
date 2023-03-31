package com.laundry.laundrysample.board.notice.application.service;

import com.laundry.laundrysample.board.notice.application.model.CreateNoticeCommand;
import com.laundry.laundrysample.board.notice.application.port.in.NoticeCommandUseCase;
import com.laundry.laundrysample.board.notice.application.port.out.NoticePort;
import com.laundry.laundrysample.board.notice.domain.NoticeId;
import com.laundry.laundrysample.common.anotation.UseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@UseCase
@RequiredArgsConstructor
@Transactional
class NoticeCommandService implements NoticeCommandUseCase {
    private final NoticePort noticePort;
    @Override
    public NoticeId createNotice(CreateNoticeCommand command) {
        return null;
    }
}
