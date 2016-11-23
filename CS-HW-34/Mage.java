//Andrew Qu [Team of Teamz {Yuyang, Michael}]
//APCS1 pd 1
//HW 34 -- Ye Olde Role Playing Game, Unchained
//2016 - 11 - 23

public class Mage extends Character{
    
    public Mage(){
	_hitPts = 100;
	_defense = 30;
	_att_rating = .6;
	_strength = 125;
	_name = "Tom";
	originalStrength = _strength;
	originalDefense = _defense;
    }

    public Mage(String inName){
	this();
	_name = inName;
    }

    //Returns a brief summary of the chosen Character
    public String about(Character c){
	return "This magical being is full of tricks up his sleeves. With his high attack rating, the mage is able to deal a great amount of damage for every hit. His high strength makes him a valuable contestant!";
    }

    //Increases character's strength and lower its defense for one attack
    public void specialize(){ 
	_defense -= (int)(Math.random() * 20);
	_strength += (int)(Math.random() * 20);
    }

    //Reverts character's stats to original values
    public void normalize(){
	_defense = originalDefense;
	_strength = originalStrength;
    }
}