package stats.pokemon.cards;

public interface Type
{
    public double getEffectiveness(Type enemyType);
    public String toString();
}