package br.org.generation.mandala.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.mandala.model.Usuario;
import br.org.generation.mandala.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
@CrossOrigin (origins = "*", allowedHeaders = "*")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	// traz todos os usuários
	@GetMapping
	public ResponseEntity<List<Usuario>> findAll (){
		return ResponseEntity.ok(usuarioRepository.findAll());
		
	}
	  // Buscando usuário por ID
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> findById (@PathVariable long id){
		return usuarioRepository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
		
	}
	// buscar usuário pelo nome
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Usuario>> findByNome(@PathVariable String nome) {
		return ResponseEntity.ok(usuarioRepository.findAllByNomeContainingIgnoreCase(nome));
		
	}
	// Criar um usuário
	@PostMapping
	public ResponseEntity<Usuario> criarUsuario (@RequestBody Usuario usuario) {
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioRepository.save(usuario));
		
	}
	// Editar um usuário
	@PutMapping
	public ResponseEntity<Usuario> editarUsuario (@RequestBody Usuario usuario) {
		return ResponseEntity.status(HttpStatus.OK).body(usuarioRepository.save(usuario));
		
	}
	//Deletar um usuário através do ID
	@DeleteMapping("/{id}")
	public void deletarUsuario (@PathVariable long id) {
		usuarioRepository.deleteById(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
