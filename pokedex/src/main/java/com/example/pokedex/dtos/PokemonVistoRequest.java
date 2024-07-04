package com.example.pokedex.dtos;

import jakarta.validation.constraints.NotBlank;

public class PokemonVistoRequest {
    @NotBlank
    private String nome;
    @NotBlank
    private String imagem;
    @NotBlank
    private String area;

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
