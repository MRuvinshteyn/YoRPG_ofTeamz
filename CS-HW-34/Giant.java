//Andrew Qu [Team of Teamz {Yuyang, Michael}]
//APCS1 pd 1
//HW 34 -- Ye Olde Role Playing Game, Unchained
//2016 - 11 - 23

public class Giant extends Character{
    
    public Giant(){ //default constructor
	_name = "Mountain";
	_hitPts = 150;
	_strength = 350;
	_defense = 25;
	_att_rating = 0.1;
	originalStrength = _strength;
	originalDefense = _defense;
    }

    public Giant(String inName){
	this();
	_name = inName;
    }

    //Returns a brief summary of the chosen Character
    public String about(Character c){
	return "A friendly monster with high strength and HP. However, due to the giant's poor vision and lack of agility, its attacks are often weaker than it's opponents.";
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
    
