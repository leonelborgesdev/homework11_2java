package com.taskmanager.domain;

import java.time.LocalDate;

public class Task {
    private long id;
    private String title;
    private String description;
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    private LocalDate dueDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public LocalDate getDueDate() {
//        return dueDate;
//    }
//
//    public void setDueDate(LocalDate dueDate) {
//        this.dueDate = dueDate;
//    }

    // toString method for displaying task information
    @Override
    public String toString() {
        return "com.taskmanager.domain.Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
//                ", dueDate=" + dueDate +
                '}';
    }
}

