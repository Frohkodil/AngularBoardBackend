package de.siebobird.AngularBoard.service;

import de.siebobird.AngularBoard.exception.TaskNotFoundException;
import de.siebobird.AngularBoard.model.Task;
import de.siebobird.AngularBoard.repo.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepo taskRepo;

    @Autowired
    public TaskService(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    public Task addTask(Task task){
        return taskRepo.save(task);
    }

    public List<Task> findAllTasks() {
        return taskRepo.findAll();
    }

    public void deleteTask(int id){
        taskRepo.deleteTaskById(id);
    }

    public List<Task> findTaskByName(String name) {
        return taskRepo.findTasksByName(name).orElseThrow(() -> new TaskNotFoundException("Task nicht gefunden"));
    }
    public Task updateTask(Task task) {
        return taskRepo.save(task);
    }
}
