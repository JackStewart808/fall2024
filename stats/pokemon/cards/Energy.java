package stats.pokemon.cards;

public class Energy extends Card
{
    protected Type type;
    
    public Type getType()
    {
        return type;
    }

    public void setType(Type inputType)
    {
        type = inputType;
    }
}