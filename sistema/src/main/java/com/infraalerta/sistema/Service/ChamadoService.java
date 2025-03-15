package com.infraalerta.sistema.Service;

import com.infraalerta.sistema.Model.Chamado;
import com.infraalerta.sistema.Repository.ChamadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChamadoService {

    @Autowired
    private ChamadoRepository repository;

    public List<Chamado> getAllChamados(){
        return repository.findAll();
    }

    public Chamado createChamado(Chamado chamado){
        return repository.save(chamado);
    }

}
