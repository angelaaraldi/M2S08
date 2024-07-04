package com.example.pokedex.controllers;

import com.example.pokedex.dtos.PokemonResponse;
import com.example.pokedex.services.PokemonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {
    private final PokemonService service;
    public PokemonController(PokemonService pokemonService) {
        this.service = pokemonService;
    }
    @GetMapping
    public List<PokemonResponse> listar() {
        return service.listarPokemons();
    }
}
