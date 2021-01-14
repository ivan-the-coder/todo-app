package com.testapp.todoapp.controller;

import com.testapp.todoapp.model.TodoDto;
import com.testapp.todoapp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class TodoController {

    private final TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public ResponseEntity<TodoDto> getTodo(@RequestParam Long id) {
        return ResponseEntity.of(Optional.of(todoService.getTodo(id)));
    }

    @PostMapping
    public ResponseEntity<TodoDto> addTodo(@RequestBody TodoDto todoDto) {
        return ResponseEntity.of(Optional.of(todoService.saveTodo(todoDto)));
    }

    @PutMapping
    public ResponseEntity<TodoDto> updateTodo(@RequestBody TodoDto todoDto) {
        return ResponseEntity.of(Optional.of(todoService.saveTodo(todoDto)));
    }
}
