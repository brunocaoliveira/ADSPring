package biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import biblioteca.LivroRepositorio.Repository;
import biblioteca.entidade.Livro;
import biblioteca.service.service;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value="/biblioteca")

public class controller {
	@Autowired
	private Repository repositorio;
	@Autowired
	private service service;
	
	@GetMapping("/livros")
	public ResponseEntity<List<Livro>> getAll() {
		return ResponseEntity.ok(repositorio.findAll());
		}
	
	@GetMapping(value = "{id}")
			public Livro findById(@PathVariable Long id){
		Livro result = repositorio.findById(id).get();
		return result;
		
	}
	@GetMapping("/livro")
	public ResponseEntity<List<Livro>> getByTitle(@RequestParam(name = "titulo") String titulo){
		return ResponseEntity.ok(repositorio.findAllBytitulo(titulo));
	}
	
	@PostMapping ("/livro")
	public ResponseEntity<Livro> post(@Valid @RequestBody Livro livro){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositorio.save(livro));
	}
	
	@PutMapping("/livro/{idLivro}")
    public ResponseEntity<Livro> update(@PathVariable Long idLivro, @RequestBody Livro livro){
        return service.updateLivro(idLivro, livro)
                .map(resp -> ResponseEntity.ok(resp))
                .orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping("/livro/{id}")
	public void delete(@PathVariable Long id) {
		repositorio.deleteById(id);
	}
}
		
	


