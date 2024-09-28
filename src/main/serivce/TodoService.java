
package com.example.demo.service;
import org.springframework.stereotype.Service;
@Service
public class TodoService {
    private TodoRepository todoRepository;
    // não é preciso usar o autowired, pois o spring já faz a injeção de dependencia
    public TodoService(TodoService todoService) {
        this.todoRepository = todoRepository; 
    }  // injeçao de dependencia do repository pelo construtor

    public List<Todo>create(Todo todo){
        return todoRepository.save(todo); // salva o objeto no banco de dados
    }
    public List<Todo>update(Todo todo){
        todoRepository.save(todo);
        
        return list(); // retorna a lista de objetos atualizada
    }
    public List<Todo>list(){

        Sort sort = Sort.by(prioridade).ascending(); // ordena os objetos por prioridade de forma crescente
        return todoRepository.findAll(sort); // retorna todos os objetos do banco de dados
    }
    public List<Todo>delete(Long id){
        todoRepository.deleteById(id); // deleta o objeto do banco de dados
        return list(); // retorna a lista de objetos atualizada

    }
    
}
