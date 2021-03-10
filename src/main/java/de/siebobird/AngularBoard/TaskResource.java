package de.siebobird.AngularBoard;

import de.siebobird.AngularBoard.model.Task;
import de.siebobird.AngularBoard.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskResource {
    private final TaskService taskService;

    public TaskResource(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Task>> getAllTasks () {
        List<Task> tasks = taskService.findAllTasks();
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

    @GetMapping("/find/{name}")
    public ResponseEntity<List<Task>> getTaskByName (@PathVariable("name") String name) {
        List<Task> tasks = taskService.findTaskByName(name);
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Task> addTask(@RequestBody Task task) {
        Task newTask = taskService.addTask(task);
        return new ResponseEntity<>(newTask, HttpStatus.CREATED);
    }
    @PostMapping("/update")
    public ResponseEntity<Task> updateTask(@RequestBody Task task) {
        Task updateTask = taskService.updateTask(task);
        return new ResponseEntity<>(updateTask, HttpStatus.OK);
    }
    @DeleteMapping("/delete{id}")
    public ResponseEntity<?> deleteTask(@PathVariable("id") int id) {
        taskService.deleteTask(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
