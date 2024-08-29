package game;

import game.Pokemon;
import game.Results;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class PokemonService {
    RestTemplate restTemplate = new RestTemplate();

    private final String API_URL = "https://pokeapi.co/api/v2/pokemon";

    public List<Pokemon> getAllPokemon() {
        Results rs = restTemplate.getForObject(API_URL, Results.class);
        assert rs != null;
        return rs.getResults();
    }


}
