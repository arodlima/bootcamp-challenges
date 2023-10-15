package tasks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tasks.model.Task;
import tasks.service.TaskService;

@RestController
@RequestMapping("tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public ResponseEntity<Iterable<Task>> showAll() {
        return ResponseEntity.ok(taskService.showAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> showById(@PathVariable Long id) {
        return ResponseEntity.ok(taskService.showById(id));
    }

    @PostMapping
    public ResponseEntity<Task> create(@RequestBody Task task) {
        taskService.create(task);
        return ResponseEntity.ok(task);
    }

    @PutMapping
    public ResponseEntity<Task> update(@RequestBody Task task) {
        taskService.update(task);
        return ResponseEntity.ok(task);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        taskService.delete(id);
        return ResponseEntity.ok().build();
    }
}
