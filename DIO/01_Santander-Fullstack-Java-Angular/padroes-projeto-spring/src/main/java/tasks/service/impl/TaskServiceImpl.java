package tasks.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tasks.model.Task;
import tasks.repository.TaskRepository;
import tasks.service.TaskService;

import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository repository;


    @Transactional
    public Iterable<Task> showAll() {
        return repository.findAll();
    }

    @Transactional
    public Task showById(Long id) {
        Optional<Task> task = repository.findById(id);
        return task.get();
    }

    @Transactional
    public void create(Task task) {
        repository.save(task);
    }

    @Transactional
    public void update(Task task) {
        Optional<Task> taskBd = repository.findById(task.getId());
        if (taskBd.isPresent()) {
            Task existingTask = taskBd.get();
            if (task.getDueDate() != null) {
                existingTask.setDueDate(task.getDueDate());
            }
            if (task.getTitle() != null) {
                existingTask.setTitle(task.getTitle());
            }
            if (task.getDescription() != null) {
                existingTask.setDescription(task.getDescription());
            }
            if (task.isCompleted()) {
                existingTask.setCompleted(true);
            }
            repository.save(existingTask);
        }
    }

    @Transactional
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
