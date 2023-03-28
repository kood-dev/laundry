package com.laundry.laundrysample.board.notice.adapter.out.persistence;


import com.laundry.laundrysample.board.notice.domain.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticeRepository extends JpaRepository<Notice, Long> {
}
