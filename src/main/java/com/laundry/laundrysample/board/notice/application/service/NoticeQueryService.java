package com.laundry.laundrysample.board.notice.application.service;

import com.laundry.laundrysample.board.notice.domain.Notice;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@Service
public class NoticeQueryService {
    //TODO dto 변경 필요
    public List<Notice> findAll() {
        return null;
    }
}
