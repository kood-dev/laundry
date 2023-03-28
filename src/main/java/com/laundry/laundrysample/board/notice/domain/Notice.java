package com.laundry.laundrysample.board.notice.domain;

import com.laundry.laundrysample.common.constant.type.YNType;
import com.laundry.laundrysample.common.entity.CreatedAndLastModifiedDate;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;

@Getter
@Entity
@SequenceGenerator(
        name = "NOTICE_SEQ_GENERATOR",
        sequenceName = "NOTICE_SEQ",
        initialValue = 1, allocationSize = 1)
public class Notice extends CreatedAndLastModifiedDate {
    @Id
    @GeneratedValue(generator = "NOTICE_SEQ_GENERATOR")
    @NonNull
    private Long id;
    @NonNull
    private String title;
    private String contents;
    private int ordinal;

    private YNType useYn = YNType.Y;

}
