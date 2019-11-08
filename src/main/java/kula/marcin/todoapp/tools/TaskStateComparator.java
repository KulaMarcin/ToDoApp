package kula.marcin.todoapp.tools;

import kula.marcin.todoapp.entity.Task;

import java.util.Comparator;

public class TaskStateComparator implements Comparator<Task> {

    @Override
    public int compare(Task task, Task t1) {
        return task.getState() - t1.getState();
    }
}
