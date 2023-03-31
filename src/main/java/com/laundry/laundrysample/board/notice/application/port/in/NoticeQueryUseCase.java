package com.laundry.laundrysample.board.notice.application.port.in;

import com.laundry.laundrysample.board.notice.application.model.NoticeFilter;
import com.laundry.laundrysample.board.notice.application.model.NoticeQuery;
import com.laundry.laundrysample.common.anotation.UseCase;

import java.util.List;
public interface NoticeQueryUseCase {
    List<NoticeQuery> findNotices(NoticeFilter noticeFilter);
}
