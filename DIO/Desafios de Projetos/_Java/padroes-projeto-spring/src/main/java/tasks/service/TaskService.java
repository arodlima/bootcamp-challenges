package tasks.service;

import tasks.model.Task;

public interface TaskService {

    Iterable<Task> showAll();
    Task showById(Long id);
    void create(Task task);
    void update(Task task);
    void delete(Long id);
}
