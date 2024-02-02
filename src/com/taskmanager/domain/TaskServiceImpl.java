package com.taskmanager.domain;

import java.util.Collections;
import java.util.List;

public class TaskServiceImpl implements  TaskService{
    private Task task;

    // Setter for injecting the task bean
    public void setTask(Task task) {
        this.task = task;
    }

    @Override
    public Task getTaskById(long id) {
        // In a real implementation, you would fetch the task by its ID from a data source
        // For this example, we'll return the injected task bean
        return task;
    }

    @Override
    public List<Task> getAllTasks() {
        // In a real implementation, you would fetch all tasks from a data source
        // For this example, we'll return a list containing the injected task bean
        return Collections.singletonList(task);
    }

    @Override
    public void addTask(Task task) {
        // In a real implementation, you would add the task to a data source
        // For this example, we'll just update the injected task bean
        this.task = task;
    }
}
