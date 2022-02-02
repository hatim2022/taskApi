package com.task.trasktracker.model

import javax.persistence.Column
import javax.validation.constraints.NotNull

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "tasks")
class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id

    @NotNull
    @Column(nullable = false)
    String title

    @NotNull
    @Column(nullable = false)
    String description

    @NotNull
    @Column(nullable = false)
    String date

    @NotNull
    @Column(nullable = false)
    boolean reminder
}
