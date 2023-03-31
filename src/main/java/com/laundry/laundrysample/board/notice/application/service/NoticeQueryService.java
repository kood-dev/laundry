package com.laundry.laundrysample.board.notice.application.service;

import com.laundry.laundrysample.board.notice.application.model.NoticeFilter;
import com.laundry.laundrysample.board.notice.application.model.NoticeQuery;
import com.laundry.laundrysample.board.notice.application.port.in.NoticeQueryUseCase;
import com.laundry.laundrysample.board.notice.application.port.out.NoticePort;
import com.laundry.laundrysample.board.notice.domain.Notice;
import com.laundry.laundrysample.common.anotation.UseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@UseCase
@Transactional(readOnly = true)
@RequiredArgsConstructor
class NoticeQueryService implements NoticeQueryUseCase {
    private final NoticePort noticePort;
    @Override
    public List<NoticeQuery> findNotices(NoticeFilter noticeFilter) {
        return null;
    }

    //TODO dto 변경 필요
    public List<Notice> findAll() {
        return null;
    }
}
