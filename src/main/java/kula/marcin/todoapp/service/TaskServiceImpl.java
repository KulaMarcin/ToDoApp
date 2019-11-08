package kula.marcin.todoapp.service;

import kula.marcin.todoapp.dao.TaskRepository;
import kula.marcin.todoapp.entity.Task;
import kula.marcin.todoapp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> findAll() {

        return taskRepository.findAll();

    }

    @Override
    public List<Task> findAllByStateAndUser(int state, User user) {

        return taskRepository.findAllByStateAndUser(state, user);

    }

    @Override
    public Task findById(int id) {

        Optional<Task> result = taskRepository.findById(id);
        Task task = null;
        if(result.isPresent())
            task = result.get();
        else
            throw new RuntimeException("Did not find thing to do id - " + id);

        return task;

    }

    @Override
    public void save(Task task) {

        taskRepository.save(task);

    }

    @Override
    public void deleteById(int id) {

        taskRepository.deleteById(id);

    }

    @Override
    @Transactional
    public void deleteAllByState(int state) {

        taskRepository.deleteAllByState(state);

    }


}
