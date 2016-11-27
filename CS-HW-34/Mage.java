//Yuyang [Team of Teamz {Andrew, Michael}]
//APCS1 pd 1
//HW 35 -- Ye Olde Role Playing Game, Realized
//2016 - 11 - 27

public class Mage extends Character{
    
    public Mage(){
	_hitPts = 100;
	_defense = 30;
	_att_rating = .6;
	_strength = 125;
	_name = "Tom";
	originalStrength = _strength;
	originalDefense = _defense;
	_mana = 300;
	attVerb = "zapped";
    }

    public Mage(String inName){
	this();
	_name = inName;
    }

    //Returns a brief summary of the chosen Character
    public String about(Character c){
	return "This magical being is full of tricks up his sleeves. With his high attack rating, the mage is able to deal a great amount of damage for every hit. His high strength makes him a valuable contestant!";
    }
    
    public String specialize(){
	_mana -= 50;
	int h = (int)(Math.random() * 30);
	_hitPts += h;
	return "The mage has healed for " + h + " points of hit!";
    }

    //Reverts character's stats to original values
    public void normalize(){
	_defense = originalDefense;
	_strength = originalStrength;
    }
}
