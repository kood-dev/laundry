package com.laundry.laundrysample.sample.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface SampleRepository extends JpaRepository<SampleEntity, Long>, QueryDslSampleRepository {
}