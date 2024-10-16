package net.crisjac.todo.service.impl;

import lombok.AllArgsConstructor;
import net.crisjac.todo.dto.TodoDto;
import net.crisjac.todo.entity.Todo;
import net.crisjac.todo.repository.TodoRepository;
import net.crisjac.todo.service.TodoService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TodoServiceImpl implements TodoService {
    private TodoRepository todoRepository;
    @Override
    public TodoDto addTodo(TodoDto todoDto) {
        // convert ToDo Dto into JPA entity
        Todo todo = new Todo();
        todo.setTitle(todoDto.getTitle());
        todo.setDescription((todoDto.getDescription()));
        todo.setCompleted(todoDto.isCompleted());

        // Todo Jpa entity
        Todo savedTodo = todoRepository.save(todo);

        // Convert saved todo jpa object into TodoDto
        TodoDto savedTodoDto = new TodoDto();
        savedTodoDto.setId(savedTodo.getId());
        savedTodoDto.setTitle(savedTodo.getTitle());
        savedTodoDto.setDescription(savedTodo.getDescription());
        savedTodoDto.setCompleted(savedTodo.isCompleted());

        return savedTodoDto;
    }
}
