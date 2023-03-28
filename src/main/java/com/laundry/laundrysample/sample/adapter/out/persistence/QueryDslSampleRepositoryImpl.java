package com.laundry.laundrysample.sample.adapter.out.persistence;

import com.laundry.laundrysample.sample.application.model.SampleFilter;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.laundry.laundrysample.sample.adapter.out.persistence.QSampleEntity.sampleEntity;

@RequiredArgsConstructor
public class QueryDslSampleRepositoryImpl implements QueryDslSampleRepository {

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<SampleEntity> findSamples(SampleFilter sampleFilter) {
        return jpaQueryFactory
                .selectFrom(sampleEntity)
                .where(
                    sampleEntity.useYn.eq(sampleFilter.getUseYn())
                    .and(sampleEntity.title.eq(sampleFilter.getTitle()))
                )
                .orderBy(sampleEntity.createdAt.desc())
                .fetch();
    }
}
