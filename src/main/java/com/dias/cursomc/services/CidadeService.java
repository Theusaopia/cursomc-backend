package com.dias.cursomc.services;

import com.dias.cursomc.domain.Cidade;
import com.dias.cursomc.repositories.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository repo;

    public List<Cidade> findByEstado(Integer estadoId) {
        return repo.findCidades(estadoId);
    }
}
