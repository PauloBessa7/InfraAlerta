package com.infraalerta.sistema.Controller;

import com.infraalerta.sistema.Model.Chamado;
import com.infraalerta.sistema.Service.ChamadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chamados")
public class ChamadoController {

    @Autowired
    private ChamadoService service;

    @GetMapping("/listar")
    public List<Chamado> getAllChamados(){
        return service.getAllChamados();
    }

    public Chamado createChamado(@RequestBody Chamado chamado){
        return service.createChamado(chamado);
    }

}
