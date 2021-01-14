package com.testapp.todoapp.service;

import com.testapp.todoapp.model.Todo;
import com.testapp.todoapp.model.TodoDto;
import com.testapp.todoapp.repository.TodoRepository;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    private final TodoRepository todoRepository;



    public Todo getTodo(Long id) {

    }

    public Todo saveTodo(TodoDto todoDto) {
        return null;
    }
}
