package br.com.cotiinformatica.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/produtos")
public class ProdutoController {
	
	@PostMapping
	public ResponseEntity<?> post(){
		
		return ResponseEntity.ok().build();
				
	}
	
	@PutMapping
	public ResponseEntity<?> put(){
		
		return ResponseEntity.ok().build();
				
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(){
		
		return ResponseEntity.ok().build();
				
	}
	
	@GetMapping
	public ResponseEntity<?> getAll(){
		
		return ResponseEntity.ok().build();
				
	}

}
