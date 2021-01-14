package com.testapp.todoapp.model;

public class Todo {
    private Long id;
    private String content;

    //Jpa only
    public Todo() {}

    public Todo(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
