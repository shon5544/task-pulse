package com.shon.taskpulse.todo.domain.entity

import com.shon.taskpulse.global.domain.entity.BaseTimeEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Decide(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long,

    var content: String,

    @Column(name = "is_done")
    var isDone: Boolean
): BaseTimeEntity()