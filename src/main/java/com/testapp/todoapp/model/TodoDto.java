package com.testapp.todoapp.model;

public class TodoDto {
    public final String content;

    public TodoDto(String content) {
        this.content = content;
    }

    public TodoDto fromEntity(Todo todo) {
        return new TodoDto(todo.getContent());
    }
}
