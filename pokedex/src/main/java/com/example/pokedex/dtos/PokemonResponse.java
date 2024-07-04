package com.example.pokedex.dtos;

public class PokemonResponse {
    private Long numero;
    private String nome;
    private boolean capturado;

    public PokemonResponse(Long numero, String nome, boolean capturado) {
        this.numero = numero;
        this.nome = nome;
        this.capturado = capturado;
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

    public boolean isCapturado() {
        return capturado;
    }

    public void setCapturado(boolean capturado) {
        this.capturado = capturado;
    }
}
