package com.example.pokedex.dtos;

public class PokemonVistoResponse {
    private Long numero;
    private String nome;
    private String imagem;
    private String area;

    public PokemonVistoResponse(Long numero, String nome, String imagem, String area) {
        this.numero = numero;
        this.nome = nome;
        this.imagem = imagem;
        this.area = area;
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

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
