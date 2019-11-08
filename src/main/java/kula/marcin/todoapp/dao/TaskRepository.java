package kula.marcin.todoapp.dao;

import kula.marcin.todoapp.entity.Task;
import kula.marcin.todoapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Integer> {

    public List<Task> findAllByStateAndUser(int state, User user);

    public void deleteAllByState(int state);
}
