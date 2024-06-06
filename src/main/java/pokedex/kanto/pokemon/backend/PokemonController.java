package pokedex.kanto.pokemon.backend;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1/pokedex")
public class PokemonController {
    
    @Autowired
    private PokemonService pokemonService;

    @GetMapping
    public ResponseEntity<List<Pokemon>> getAllPokemon() {
        return new ResponseEntity<List<Pokemon>>(pokemonService.allPokemon(), HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<Optional<Pokemon>> getSinglePokemon(@PathVariable String name){
        return new ResponseEntity<Optional<Pokemon>>(pokemonService.singlePokemon(name), HttpStatus.OK);
    }
    
}