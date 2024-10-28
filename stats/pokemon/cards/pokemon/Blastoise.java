package stats.pokemon.cards.pokemon;

import stats.pokemon.cards.Pokemon;
import stats.pokemon.cards.types.Water;

public class Blastoise extends Pokemon
{

    public Blastoise()
    {
        setType(new Water());
        setHp(200);
        energyCount = 0;
        setName("Blastiose");
        setAttack1Name("Water Gun");
        setAttack2Name("Aqua Tail");
        setAttack3Name("Rain Dance");
        setAttack4Name("Wave Crash");

    }

    //Pokemon's 4 Attack Options are stored here, attack strength or style is adjusted through the paramaters
    public int attack1(Pokemon enemyPokemon) {   
        return attack(enemyPokemon, attack1Name, .6, 50, .1, 0);
    }
    public int attack2(Pokemon enemyPokemon) {   
        return attack(enemyPokemon, attack2Name, .7, 80, .3, 1);
    }
    public int attack3(Pokemon enemyPokemon) {   
        return attack(enemyPokemon, attack3Name, .8, 70, .15, 2);
    }
    public int attack4(Pokemon enemyPokemon) {   
        return attack(enemyPokemon, attack4Name, .9, 115, .3, 3);
    }
}