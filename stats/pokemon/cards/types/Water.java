package stats.pokemon.cards.types;

import stats.pokemon.cards.Type;

public class Water implements Type
{

    public String toString()
    {
        return "Water";
    }

    public double getEffectiveness(Type inputType)
    {
        if(inputType.getClass().equals(Water.class))
        {
            return 1;
        }
        else if(inputType.getClass().equals(Fire.class))
        {
            return 2;
        }
        else if (inputType.getClass().equals(Grass.class))
        {
            return 0.5;
        }
        return -1; //Error Has Occoured if Type does Not Exist in Database;

    }
}