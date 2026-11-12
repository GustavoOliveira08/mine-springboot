package com.dt2.mine.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Jogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String genero;
    private String plataforma;
    private String imagem;
    private int anoLancamento;
    private String descricao;

    public Jogo(){}

    public Jogo(int id, String nome, String genero, String plataforma, String imagem, int anoLancamento, String descricao){
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.plataforma = plataforma;
        this.imagem = imagem;
        this.anoLancamento = anoLancamento;
        this.descricao = descricao;
    }

    public Jogo(String nome, String genero, String plataforma, String imagem, int anoLancamento, String descricao){
        this.nome = nome;
        this.genero = genero;
        this.plataforma = plataforma;
        this.imagem = imagem;
        this.anoLancamento = anoLancamento;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public String getImagem() {
        return imagem;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
