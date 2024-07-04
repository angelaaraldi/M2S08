package com.example.pokedex.dtos;

import com.example.pokedex.enums.Tipo;

public class PokemonCapturadoResponse {
    private Long numero;
    private String nome;
    private String descricao;
    private String imagem;
    private Tipo tipo;
    private String categoria;
    private String area;
    private double altura;
    private double peso;

    public PokemonCapturadoResponse(Long numero, String nome, String descricao, String imagem, Tipo tipo, String categoria, String area, double altura, double peso) {
        this.numero = numero;
        this.nome = nome;
        this.descricao = descricao;
        this.imagem = imagem;
        this.tipo = tipo;
        this.categoria = categoria;
        this.area = area;
        this.altura = altura;
        this.peso = peso;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
