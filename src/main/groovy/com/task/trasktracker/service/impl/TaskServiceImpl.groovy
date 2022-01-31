package com.task.trasktracker.service.impl

import com.task.trasktracker.model.Task
import com.task.trasktracker.repository.TaskRepository
import com.task.trasktracker.service.TaskService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TaskServiceImpl implements TaskService{

    @Autowired
    private final TaskRepository taskRepository;

    @Override
    List<Task> findAll() {
        taskRepository.findAll()
    }

    @Override
    Optional<Task> findById(Integer id) {
        taskRepository.findById(id)
    }

    @Override
    Task save(Task task) {
        taskRepository.save(task)
    }
}
