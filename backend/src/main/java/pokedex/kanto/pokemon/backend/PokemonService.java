package pokedex.kanto.pokemon.backend;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    public List<Pokemon> allPokemon() {
        return pokemonRepository.findAll();
    }

    public Optional<Pokemon> singlePokemon(String name) {
        return pokemonRepository.findPokemonByName(name);
    }
}
