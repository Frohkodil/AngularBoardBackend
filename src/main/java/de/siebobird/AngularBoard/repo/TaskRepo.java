package de.siebobird.AngularBoard.repo;

import de.siebobird.AngularBoard.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task, Integer> {
}
