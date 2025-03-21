package pokedex.kanto.pokemon.backend;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PokemonRepository extends MongoRepository<Pokemon, ObjectId> {
    Optional<Pokemon> findPokemonByName(String name);
}