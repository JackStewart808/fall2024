package stats.pokemon.cards;

import java.util.Random;

public class Pokemon extends Card
{
    protected int hp;
    protected Type type;
    protected int energyCount;

    public String attack1Name;
    public String attack2Name;
    public String attack3Name;
    public String attack4Name;

    public void setName(String inputName)
    {
        super.setName(inputName);
    }

    public String getName()
    {
        return name;
    }

    public void setAttack1Name(String inputName)
    {
        attack1Name = inputName;
    }

    public String getAttack1Name()
    {
        return attack1Name;
    }
    public void setAttack2Name(String inputName)
    {
        attack2Name = inputName;
    }

    public String getAttack2Name()
    {
        return attack2Name;
    }
    public void setAttack3Name(String inputName)
    {
        attack3Name = inputName;
    }

    public String getAttack3Name()
    {
        return attack3Name;
    }
    public void setAttack4Name(String inputName)
    {
        attack4Name = inputName;
    }

    public String getAttack4Name()
    {
        return attack4Name;
    }

    public void setHp(int inputHp)
    {
        hp = inputHp;
    }

    public int getHp()
    {
        return hp;
    }

    public void setEnergyCount(int inputEnergyCount)
    {
        energyCount = inputEnergyCount;
    }

    public int getEnergyCount()
    {
        return energyCount;
    }

    public void setType(Type inputType)
    {
        type = inputType;
    }

    public Type getType()
    {
        return type;
    }

    public int attack1(Pokemon enemyPokemon)
    {
        return -1;
    }

    public int attack2(Pokemon enemyPokemon)
    {
        return -1;
    }

    public int attack3(Pokemon enemyPokemon)
    {
        return -1;
    }

    public int attack4(Pokemon enemyPokemon)
    {
        return -1;
    }

    public void damage(int damageAmount)
    {
        hp -= damageAmount;
        if(hp < 0)
        {
            hp = 0;
        }
    }

    //The fundamental attack function that every attacking move calls
    public int attack(Pokemon enemyPokemon, String attackName, double hitRate, int damage, double critChance, int energyReq)
    {
        //Check if Pokemon has sufficient energy
        if(energyCount < energyReq)
        {
            return -1;
        }

        System.out.println(name + " Attacks With " + attackName);
        //Wait a second to allow the user to read and build a bit of suspense
        try
        {
            Thread.sleep(500);
        }
        catch(InterruptedException e)
        {

        }
        //Prepares to generate a random value for the quality of the hit
        Random rand = new Random();
        double hitRoll = rand.nextDouble();

        //Change damage based on type matchup
        damage = (int) Math.round(damage * getType().getEffectiveness(enemyPokemon.getType())); 

        if(hitRoll > hitRate) //Implements Missing
        {
            System.out.println("The Attack Missed");
            return 0;
        }
        else if(hitRoll < critChance) //Implements Critting
        {
            damage *= 1.5;
            System.out.print("The Attack Critically Hit For " + damage + "Damage, ");
        }
        else //If neither crit nor miss, 
        {
            System.out.print("The Attack Hit For " + damage + "Damage");
            
        }
        
        if(getType().getEffectiveness(enemyPokemon.getType()) < .8)
        {
            System.out.println(", It Was Not Very Effective!");
        }
        else if(getType().getEffectiveness(enemyPokemon.getType()) > 1.3)
        {
            System.out.println(", It Was Super Effective!");
        }
        else
        {
            System.out.println("!");
        }
        return damage;
    }

}