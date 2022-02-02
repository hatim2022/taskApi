package com.task.trasktracker.service

import com.task.trasktracker.model.Task

interface TaskService {
    List<Task> findAll()

    Optional<Task> findById(Integer id)

    Task save(Task task)

    void delete(Integer id)
}
