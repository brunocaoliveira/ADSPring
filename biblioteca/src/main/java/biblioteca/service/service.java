package biblioteca.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import biblioteca.LivroRepositorio.Repository;
import biblioteca.entidade.Livro;

@Service
public class service {
	@Autowired
	private Repository repositorio;
	
	public Optional<Livro> updateLivro (Long Id, Livro livroUpdate){
		if (repositorio.findById(Id).isPresent()) {
			return Optional.of(repositorio.save(livroUpdate));
		}
		throw new RuntimeException("Livro não localizado", null);
		
		}
	}


