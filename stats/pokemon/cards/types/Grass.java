package stats.pokemon.cards.types;

import stats.pokemon.cards.Type;

public class Grass implements Type
{

    public String toString()
    {
        return "Grass";
    }

    public double getEffectiveness(Type inputType)
    {
        if(inputType.getClass().equals(Water.class))
        {
            return 2;
        }
        else if(inputType.getClass().equals(Fire.class))
        {
            return 0.5;
        }
        else if (inputType.getClass().equals(Grass.class))
        {
            return 1;
        }
        return -1; //Error Has Occoured if Type does Not Exist in Database;

    }
}