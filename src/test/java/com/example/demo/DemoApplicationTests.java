package com.example.demo;

import org.glassfish.jaxb.core.v2.TODO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.example.demo.Todo; // Import the Todo class


@SuppressWarnings("unused")
@SpringBootTest
class DemoApplicationTests {
	@SuppressWarnings("unused")
	@Autowired
	private WebTestClient webTestClient;



	@Test
	void  testCreateTodoSuccess() {
		 // Teste de criação de um Todo com sucesso
		 var todo = new Todo( "titulo", "descricao"); {
		 }
	webTestClient.post().uri("/todo")
		.bodyValue(todo)
		.exchange()
		.expectStatus().isCreated()
		.expectBody(Todo.class)
		.isEqualTo(todo);
}
	@Test 
	void testeCreateTodoFail() { // Teste de falha na criação de um Todo
		webTestClient.post().uri("/todo")
		.bodyValue(new Todo(null, "descricao"))
		.exchange()
		.expectStatus().isBadRequest();

	}

}
