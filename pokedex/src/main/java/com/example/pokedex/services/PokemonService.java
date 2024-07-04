package com.example.pokedex.services;

import com.example.pokedex.dtos.*;
import com.example.pokedex.models.Pokemon;
import com.example.pokedex.repositories.PokemonRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PokemonService {
    private final PokemonRepository repository;
    public PokemonService(PokemonRepository pokemonRepository) {
        this.repository = pokemonRepository;
    }
    public List<PokemonResponse> listarPokemons() {
        List<Pokemon> lista = repository.findAll();
        if (!lista.isEmpty()) {
            List<PokemonResponse> listaResponse = new ArrayList<>();
            for (Pokemon pokemon : lista) {
                listaResponse.add(new PokemonResponse(pokemon.getNumero(), pokemon.getNome(), pokemon.isCapturado()));
            }
            return listaResponse;
        }
        return null;
    }
}
