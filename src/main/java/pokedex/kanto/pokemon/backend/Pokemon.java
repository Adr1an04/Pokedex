package pokedex.kanto.pokemon.backend;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "pokemon")
@Data 
@AllArgsConstructor
@NoArgsConstructor
public class Pokemon {
    @Id
    private ObjectId _id;

    private int number;
    private String name;

    private int types;
    private String type1;
    private String type2;

    private Double height;
    private Double weight;

    private int base_total;
    private int attack;
    private int defense;
    private int special;
    private int speed;

    private int evolutions;
    private int legendary;
}