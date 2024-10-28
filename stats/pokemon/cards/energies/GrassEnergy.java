package stats.pokemon.cards.energies;

import stats.pokemon.cards.Energy;
import stats.pokemon.cards.types.Grass;

public class GrassEnergy extends Energy
{
    public GrassEnergy()
    {
        type = new Grass();
        setName("Grass Energy");
    }
}