import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;


@Entity // para indicar que é uma entidade
@Table(name = "todos") // para indicar que é uma tabela

public class Todo {
    @Id // id para identificar o objeto
    @GeneratedValue(strategy = GenerationType.IDENTITY) // para gerar o id automaticamente
    private Long id;  // id do objeto
    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descricao")
    private String descricao;


    public Todo(String titulo, String descricao) { // construtor
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public Todo() { 
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}