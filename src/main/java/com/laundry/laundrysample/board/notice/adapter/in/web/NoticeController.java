package com.laundry.laundrysample.board.notice.adapter.in.web;

import com.laundry.laundrysample.board.notice.application.service.NoticeQueryService;
import com.laundry.laundrysample.board.notice.domain.Notice;
import com.laundry.laundrysample.common.model.CommonResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class NoticeController {
    private final NoticeQueryService noticeQueryService;

    @GetMapping("/v1/notice")
    public CommonResponse<List<Notice>> findAll() {
        return CommonResponse.ok(noticeQueryService.findAll());
    }
}
