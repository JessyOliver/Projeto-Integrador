package br.org.generation.mandala.model;

// import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name = "tb_usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull (message = "o atributo nome precisa ser preenchido")
	@Size (max = 255)
	private String nome;
	
	//@NotNull (message = "o atributo data de nascimento precisa ser preenchido")
	// private Date dtNascimento; 
	
	@NotNull (message = "o atributo gênero precisa ser preenchido")
	@Size (max = 50)
	private String genero;
	
	@NotNull (message = "o atributo biografia precisa ser preenchido")
	@Size (max = 160)
	private String biografia;
	
	@NotNull (message = "o atributo email precisa ser preenchido")
	@Size (max = 100)
	private String email;
	
	@NotNull (message = "o atributo senha precisa ser preenchido")
	private String  senha;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
