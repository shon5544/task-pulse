package com.shon.taskpulse.global.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.MappedSuperclass
import jakarta.persistence.PrePersist
import java.time.LocalDateTime

@MappedSuperclass
abstract class BaseTimeEntity(
    @Column(name = "created_at")
    var createdAt: LocalDateTime? = null,
) {

    @PrePersist
    fun onPersist() {
        createdAt = LocalDateTime.now()
    }
}