package com.laundry.laundrysample.common.entity;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NonNull;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
public abstract class CreatedAndLastModifiedDate {
    @CreatedDate
    @NonNull
    private LocalDateTime createdAt;

    @LastModifiedDate
    @NonNull
    private LocalDateTime lastModifiedAt;
}
