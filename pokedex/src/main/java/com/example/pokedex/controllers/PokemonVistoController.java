package com.example.pokedex.controllers;

import com.example.pokedex.dtos.PokemonVistoRequest;
import com.example.pokedex.dtos.PokemonVistoResponse;
import com.example.pokedex.services.PokemonVistoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pokemons/vistos")
public class PokemonVistoController {
    private final PokemonVistoService service;
    public PokemonVistoController(PokemonVistoService pokemonVistoService) {
        this.service = pokemonVistoService;
    }
    @PostMapping
    public void cadastrar(@Valid @RequestBody PokemonVistoRequest pokemonVisto) {
        service.cadastrarPokemonVisto(pokemonVisto);
    }
    @PutMapping("/{id}")
    public void atualizar(@PathVariable Long id, @Valid @RequestBody PokemonVistoRequest pokemonVisto) {
        service.atualizarPokemonVisto(id, pokemonVisto);
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletarPokemonVisto(id);
    }
    @GetMapping("/{id}")
    public PokemonVistoResponse buscar(@PathVariable Long id) {
        return service.buscarPokemonVisto(id);
    }
}
