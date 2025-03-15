package com.infraalerta.sistema.Model;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Value;

@Entity(name = "Chamado")
public class Chamado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 60)
    private String titulo;

    @Column(length = 300)
    private String descricao;

    private int curtidas;

    private String cidade;

    private String bairro;

    private String rua;

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getRua() {
        return rua;
    }

    public String getDescricao() {
        return descricao;
    }
}
