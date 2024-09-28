
package com.example.demo.controller;
import com.example.demo.models.Todo; // importa a classe Todo
import com.example.demo.service.TodoService; // importa a classe TodoService
import org.springframework.web.bind.annotation.RestController; // importa a classe RestController
import org.springframework.web.bind.annotation.PostMapping; // importa a classe PostMapping
import org.springframework.web.bind.annotation.PutMapping; // importa a classe PutMapping
import java.util.List; // importa a classe List
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/todo") // mapeia a url para acessar o controller
@RestController // indica que a classe é um controller
public class TodoController {
   private TodoService todoService; // injeção de dependencia do service pelo construtor

 public TodoController(TodoService todoService) { // injeção de dependencia do service pelo construtor
     this.todoService = todoService;

 }
    @PostMapping list<Todo> create(@RequestBody Todo todo) {
        return todoService.create(todo); // chama o metodo create do service
    }
    list<Todo> list() {
        return todoService.list(); // chama o metodo list do service
    }
    list<Todo> update(@RequestBody Todo todo) {
        return todoService.update(todo); // chama o metodo update do service
    }
    
    @DeleteMapping
    list<Todo> delete(@PathVariable("id") Long id) {
        return todoService.delete(id); // chama o metodo delete do service
    }

 

}
