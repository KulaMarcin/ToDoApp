package kula.marcin.todoapp.service;

import kula.marcin.todoapp.entity.Task;
import kula.marcin.todoapp.entity.User;

import java.util.List;

public interface TaskService {

    public List<Task> findAll();

    public List<Task> findAllByStateAndUser(int state, User user);

    public Task findById(int id);

    public void save(Task task);

    public void deleteById(int id);

    public void deleteAllByState(int state);


}
