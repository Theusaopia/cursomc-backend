package com.dias.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dias.cursomc.domain.Categoria;
import com.dias.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id); //findById adicionado pelo spring com versoes maiores que 2, retornar um obj Optional
		return obj.orElse(null);
	}
}
