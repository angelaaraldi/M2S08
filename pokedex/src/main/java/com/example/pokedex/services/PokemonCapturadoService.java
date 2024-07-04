package com.example.pokedex.services;

import com.example.pokedex.dtos.PokemonCapturadoRequest;
import com.example.pokedex.dtos.PokemonCapturadoResponse;
import com.example.pokedex.models.Pokemon;
import com.example.pokedex.repositories.PokemonRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PokemonCapturadoService {
    private final PokemonRepository repository;
    public PokemonCapturadoService(PokemonRepository pokemonRepository) {
        this.repository = pokemonRepository;
    }
    public void cadastrarPokemonCapturado(PokemonCapturadoRequest pokemonCapturadoRequest) {
        Pokemon pokemon = new Pokemon();
        pokemon.setNome(pokemonCapturadoRequest.getNome());
        pokemon.setDescricao(pokemonCapturadoRequest.getDescricao());
        pokemon.setImagem(pokemonCapturadoRequest.getImagem());
        pokemon.setTipo(pokemonCapturadoRequest.getTipo());
        pokemon.setCategoria(pokemonCapturadoRequest.getCategoria());
        pokemon.setArea(pokemonCapturadoRequest.getArea());
        pokemon.setAltura(pokemonCapturadoRequest.getAltura());
        pokemon.setPeso(pokemonCapturadoRequest.getPeso());
        pokemon.setCapturado(true);
        repository.save(pokemon);
    }
    public void atualizarPokemonCapturado(Long id, PokemonCapturadoRequest pokemonCapturadoRequest) {
        Pokemon pokemon = repository.findById(id).orElseThrow(EntityNotFoundException::new);
        if (pokemon != null && pokemon.isCapturado()) {
            pokemon.setNome(pokemonCapturadoRequest.getNome());
            pokemon.setDescricao(pokemonCapturadoRequest.getDescricao());
            pokemon.setImagem(pokemonCapturadoRequest.getImagem());
            pokemon.setTipo(pokemonCapturadoRequest.getTipo());
            pokemon.setCategoria(pokemonCapturadoRequest.getCategoria());
            pokemon.setArea(pokemonCapturadoRequest.getArea());
            pokemon.setAltura(pokemonCapturadoRequest.getAltura());
            pokemon.setPeso(pokemonCapturadoRequest.getPeso());
            repository.save(pokemon);
        }
    }
    public void deletarPokemonCapturado(Long id) {
        Pokemon pokemon = repository.findById(id).orElseThrow(EntityNotFoundException::new);
        if (pokemon != null && pokemon.isCapturado()) {
            repository.delete(pokemon);
        }
    }
    public PokemonCapturadoResponse buscarPokemonCapturado(Long id) {
        Pokemon pokemon = repository.findById(id).orElseThrow(EntityNotFoundException::new);
        if (pokemon != null && pokemon.isCapturado()) {
            return new PokemonCapturadoResponse(pokemon.getNumero(), pokemon.getNome(), pokemon.getDescricao(), pokemon.getImagem(), pokemon.getTipo(), pokemon.getCategoria(), pokemon.getArea(), pokemon.getAltura(), pokemon.getPeso());
        }
        return null;
    }
}
