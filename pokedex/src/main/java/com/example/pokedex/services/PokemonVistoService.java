package com.example.pokedex.services;

import com.example.pokedex.dtos.PokemonVistoRequest;
import com.example.pokedex.dtos.PokemonVistoResponse;
import com.example.pokedex.models.Pokemon;
import com.example.pokedex.repositories.PokemonRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PokemonVistoService {
    private final PokemonRepository repository;
    public PokemonVistoService(PokemonRepository pokemonRepository) {
        this.repository = pokemonRepository;
    }
    public void cadastrarPokemonVisto(PokemonVistoRequest pokemonVistoRequest) {
        Pokemon pokemon = new Pokemon();
        pokemon.setNome(pokemonVistoRequest.getNome());
        pokemon.setImagem(pokemonVistoRequest.getImagem());
        pokemon.setArea(pokemonVistoRequest.getArea());
        pokemon.setCapturado(false);
        repository.save(pokemon);
    }
    public void atualizarPokemonVisto(Long id, PokemonVistoRequest pokemonVistoRequest) {
        Pokemon pokemon = repository.findById(id).orElseThrow(EntityNotFoundException::new);
        if (pokemon != null && !pokemon.isCapturado()) {
            pokemon.setNome(pokemonVistoRequest.getNome());
            pokemon.setImagem(pokemonVistoRequest.getImagem());
            pokemon.setArea(pokemonVistoRequest.getArea());
            repository.save(pokemon);
        }
    }
    public void deletarPokemonVisto(Long id) {
        Pokemon pokemon = repository.findById(id).orElseThrow(EntityNotFoundException::new);
        if (pokemon != null && !pokemon.isCapturado()) {
            repository.delete(pokemon);
        }
    }
    public PokemonVistoResponse buscarPokemonVisto(Long id) {
        Pokemon pokemon = repository.findById(id).orElseThrow(EntityNotFoundException::new);
        if (pokemon != null && !pokemon.isCapturado()) {
            return new PokemonVistoResponse(pokemon.getNumero(), pokemon.getNome(), pokemon.getImagem(), pokemon.getArea());
        }
        return null;
    }
}
