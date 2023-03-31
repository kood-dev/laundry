package com.laundry.laundrysample.board.notice.adapter.in.web;

import com.laundry.laundrysample.board.notice.adapter.in.web.model.CreateNoticeRequest;
import com.laundry.laundrysample.board.notice.adapter.in.web.model.FilterNoticeRequest;
import com.laundry.laundrysample.board.notice.application.model.NoticeQuery;
import com.laundry.laundrysample.board.notice.application.port.in.NoticeCommandUseCase;
import com.laundry.laundrysample.board.notice.application.port.in.NoticeQueryUseCase;
import com.laundry.laundrysample.board.notice.domain.NoticeId;
import com.laundry.laundrysample.common.model.CommonResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class NoticeController {
    private final NoticeQueryUseCase queryUseCase;
    private final NoticeCommandUseCase commandUseCase;

    @GetMapping("/v1/notice")
    public CommonResponse<List<NoticeQuery>> findAll(FilterNoticeRequest request) {
        return CommonResponse.ok(queryUseCase.findNotices(request.toFilter()));
    }

    @PostMapping("/v1/notice")
    public CommonResponse<NoticeId> createNotice(CreateNoticeRequest request) {
        return CommonResponse.created(commandUseCase.createNotice(request.toCommand()));
    }
}
