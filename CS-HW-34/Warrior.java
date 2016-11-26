//Andrew Qu [Team of Teamz {Yuyang, Michael}]
//APCS1 pd 1
//HW 34 -- Ye Olde Role Playing Game, Unchained
//2016 - 11 - 23

public class Warrior extends Character{ //Warrior is a subclass of Character 
    
    public Warrior(){ //default constructor
	_hitPts = 125;
	_strength = 100;
	_defense = 40;
	_att_rating = .4;
	_name = "Tom";
	originalStrength = _strength;
	originalDefense = _defense;
	_mana = 300;
	attVerb = "swung his sword";
    }
    
    public Warrior(String inName){ //overloaded constructor
	this();
	_name = inName;
	   
    }

    //Returns a brief summary of the chosen Character
    public String about(Character c){
	return "This brave hero is the leader of the rebellion. As a balanced fighter, the warrior has a relatively high defense allowing him to fight through hoards of monsters!";
    }

    //Increases character's strength and lower its defense for one attack
    public String specialize(){
	_mana -= 50;
	_defense -= (int)(Math.random() * 10);
	_strength += 10 + (int)(Math.random() * 10);
	return "LEEERRROOYYY JJENKIIINNNSSS";
    }

    //Reverts character's stats to original values
    public void normalize(){
	_defense = originalDefense;
	_strength = originalStrength;
    }
}
