package de.siebobird.AngularBoard.repo;

import de.siebobird.AngularBoard.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TaskRepo extends JpaRepository<Task, Integer> {
    void deleteTaskById(int id);

    Optional<List<Task>> findTasksByName(String name);

}
