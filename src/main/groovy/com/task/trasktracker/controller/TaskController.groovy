package com.task.trasktracker.controller

import com.task.trasktracker.model.Task
import com.task.trasktracker.service.TaskService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping('/tasks')
@CrossOrigin(origins = "http://localhost:3000")
class TaskController {

    @Autowired
    private final TaskService taskService

    @GetMapping
    List<Task> findAll(){
        taskService.findAll()
    }

    @GetMapping("/{id}")
    Optional<Task> findById(@PathVariable('id') int id){
       taskService.findById(id)
    }

    @PostMapping("/add")
    Task save(@RequestBody Task task){
        taskService.save(task)
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable('id') int id){
        taskService.delete(id)
    }

    @PutMapping("/{id}")
    Task update(@PathVariable('id') int id,@RequestBody Task task){
        task.setId(id)
        taskService.save(task)
    }

}
