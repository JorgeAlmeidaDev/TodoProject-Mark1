import org.springframework.data.jpa.repository.JpaRepository;  // Importing JpaRepository
import br.com.todoapp.models.Todo; // Importing Todo model

public interface TodoRepository extends JpaRepository<Todo, Long> { // Extending JpaRepository
}


