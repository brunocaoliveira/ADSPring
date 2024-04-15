package biblioteca.entidade;


import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.persistence.Id;



@Entity

@Table(name = "trab_livro")
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long Id;
	
	@NotBlank
	@Size(max = 100)
	private String titulo;
	@NotNull @Size (max = 150)
	private String autor_principal;
	
	@NotNull
	private Integer ano_publicacao;
	
	@NotNull
	private Date data_criacao;
	
	@NotNull
	private Date data_alteracao;
	
	@NotNull
	private Integer edicao;
	
	public Long getIdLivro() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor_principal() {
		return autor_principal;
	}

	public void setAutor_principal(String autor_principal) {
		this.autor_principal = autor_principal;
	}

	public Integer getAno_publicacao() {
		return ano_publicacao;
	}

	public void setAno_publicacao(Integer ano_publicacao) {
		this.ano_publicacao = ano_publicacao;
	}
	

	public Integer getEdicao() {
		return edicao;
	}

	public void setEdicao(Integer edicao) {
		this.edicao = edicao;
	}
	


	public Date getData_criacao() {
		return data_criacao;
	}

	public void setData_criacao(Date data_criacao) {
		this.data_criacao = data_criacao;
	}

	public Date getData_alteracao() {
		return data_alteracao;
	}

	public void setData_alteracao(Date data_alteracao) {
		this.data_alteracao = data_alteracao;
	}

	
	
	
	
	
		
	
	
	

}
