package biblioteca.LivroRepositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import biblioteca.entidade.Livro;


public interface Repository extends JpaRepository<Livro, Long>{
	
public List<Livro> findAllBytitulo(String titulo);}
