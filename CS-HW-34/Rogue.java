//Yuyang [Team of Teamz {Andrew, Michael}]
//APCS1 pd 1
//HW 35 -- Ye Olde Role Playing Game, Realized
//2016 - 11 - 27

public class Rogue extends Character{
    
    public Rogue(){
	_hitPts = 85;
	_defense = 30;
	_att_rating = .9;
	_strength = 100;
	_name = "Tom";
	originalStrength = _strength;
	originalDefense = _defense;
	_mana = 200;
	attVerb = "shanked";
    }

    public Rogue(String inName){
	this();
	_name = inName;
    }

    //Returns a brief summary of the chosen Character
    public String about(Character c){
	return "While the rogue may be the most vulnerable out of the pack, he is also the most accurate. As he has the highest attack rating, the rogue is sure to end battles quick and clean!";
    }

    public String specialize(){
	_mana -= 50;
	_defense += (int)(Math.random() * 1000);
	_strength += (int)(Math.random() * 20);
	_hitPts += 1;
	return "Rogue's agility has allowed him to dodge an attack!";
    }

    //Reverts character's stats to original values
    public void normalize(){
	_defense = originalDefense;
	_strength = originalStrength;
    }
}
