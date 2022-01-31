package com.task.trasktracker.repository

import com.task.trasktracker.model.Task
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TaskRepository extends JpaRepository<Task, Integer> {

    List<Task> findAll()

    Task getById(Integer id)

    Task save(Task task)

    Optional<Task> findById(Integer id)
}
