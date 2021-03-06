package de.siebobird.AngularBoard.service;

import de.siebobird.AngularBoard.model.Task;
import de.siebobird.AngularBoard.repo.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    private final TaskRepo taskRepo;

    @Autowired
    public TaskService(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }
}
