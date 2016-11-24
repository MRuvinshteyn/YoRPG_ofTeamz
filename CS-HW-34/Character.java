//Andrew Qu [Team of Teamz {Yuyang, Michael}]
//APCS1 pd 1
//HW 34 -- Ye Olde Role Playing Game, Unchained
//2016 - 11 - 23

public abstract class Character{

    //Instance Variables
    protected int _hitPts;
    protected int _strength;
    protected int _defense;
    protected double _att_rating;
    protected String _name;
    protected int originalStrength;
    protected int originalDefense;
    protected int _mana;
    protected String attVerb;

    //Accessor for health
    protected int getHealth(){
	return _hitPts;
    }
    
    //Returns whether the Character is alive
    protected boolean isAlive(){
	return _hitPts > 0;
    }

    //Accesser Method for name
    protected String getName(){
	return _name;
    }
    
    //Accessor Method for defense
    protected int getDefense(){
	return _defense;
    }

    //Mutator Method for health
    protected void lowerHP(int amt){
	_hitPts -= amt;
    }

    protected int getMana(){
	return _mana;
    }

    protected String getVerb(){
	return attVerb;
    }
    
    //Increases character's strength and lower its defense for one attack
    protected abstract String specialize();

    //Reverts character's stats to original values
    protected abstract void normalize();


    //Returns a description of the chosen Character
    protected abstract String about(Character c);
    
    //Lowers the health of the opponent based on attack rating, strength, and defense of opponent
    protected int attack(Character c){
	int damage = (int)((_strength * _att_rating) - c._defense);
	if (damage <= 0){
	    damage = 1;
	}
	c.lowerHP(damage);
	return damage;
    }
}
