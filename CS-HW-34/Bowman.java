//Andrew Qu [Team of Teamz {Yuyang, Michael}]
//APCS1 pd 1
//HW 34 -- Ye Olde Role Playing Game, Unchained
//2016 - 11 - 23

public class Bowman extends Character{
    
    public Bowman(){
	_hitPts = 90;
	_defense = 25;
	originalDefense = _defense;
	_att_rating = .6;
	_strength = 150;
	originalStrength = _strength; 
	_name = "Tom";
	_mana = 250;
	attVerb = "shot";
    }

    public Bowman(String inName){
	this();
	_name = inName;
    }

    //Returns a brief summary of the chosen Character
    public String about(Character c){
	return "This sharpshooter is known for his efficiency with weapons. With a strength even higher than the Mage's, the bowman is quite an offensive player. However, watch out for enemy attacks!";
    }
    
    public String specialize(){
	_mana -= 50;
	_defense -= (int)(Math.random() * 20);
	_strength += _strength;
	return "The bowman has landed a critical strike!";
    }

    //Reverts character's stats to original values
    public void normalize(){
	_defense = originalDefense;
	_strength = originalStrength;
    }
}
