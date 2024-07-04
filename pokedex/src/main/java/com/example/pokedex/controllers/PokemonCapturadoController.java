package com.example.pokedex.controllers;

import com.example.pokedex.dtos.PokemonCapturadoRequest;
import com.example.pokedex.dtos.PokemonCapturadoResponse;
import com.example.pokedex.services.PokemonCapturadoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pokemons/capturados")
public class PokemonCapturadoController {
    private final PokemonCapturadoService service;
    public PokemonCapturadoController(PokemonCapturadoService pokemonCapturadoService) {
        this.service = pokemonCapturadoService;
    }
    @PostMapping
    public void cadastrar(@Valid @RequestBody PokemonCapturadoRequest pokemonCapturado) {
        service.cadastrarPokemonCapturado(pokemonCapturado);
    }
    @PutMapping("/{id}")
    public void atualizar(@PathVariable Long id, @Valid @RequestBody PokemonCapturadoRequest pokemonCapturado) {
        service.atualizarPokemonCapturado(id, pokemonCapturado);
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletarPokemonCapturado(id);
    }
    @GetMapping("/{id}")
    public PokemonCapturadoResponse buscar(@PathVariable Long id) {
        return service.buscarPokemonCapturado(id);
    }
}
