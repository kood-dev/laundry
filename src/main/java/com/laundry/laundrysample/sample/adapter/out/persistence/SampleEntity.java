package com.laundry.laundrysample.sample.adapter.out.persistence;

import com.laundry.laundrysample.common.constant.type.YNType;
import com.laundry.laundrysample.common.entity.CreatedAndLastModifiedDate;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@SequenceGenerator(
        name = "SAMPLE_SEQ_GENERATOR",
        sequenceName = "SAMPLE_SEQ",
        initialValue = 1, allocationSize = 1)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
class SampleEntity extends CreatedAndLastModifiedDate {
    @Id
    @GeneratedValue(generator = "SAMPLE_SEQ_GENERATOR")
    @Column(name = "sampleId")
    private Long id;
    @Column(length = 512)
    private String title;
    @Lob
    private String contents;
    private int ordinal;
    private YNType useYn;
    private Integer creator;
    private Integer lastModifier;

}

