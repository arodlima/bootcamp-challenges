package tasks.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tasks.model.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
}
