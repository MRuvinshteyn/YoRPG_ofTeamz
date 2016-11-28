//Yuyang [Team of Teamz {Andrew, Michael}]
//APCS1 pd 1
//HW 35 -- Ye Olde Role Playing Game, Realized
//2016 - 11 - 27

public class Giant extends Character{
    
    public Giant(){ //default constructor
	_name = "Mountain";
	_hitPts = 150;
	_strength = 350;
	_defense = 25;
	_att_rating = 0.1;
	originalStrength = _strength;
	originalDefense = _defense;
	_mana = 200;
	attVerb = "struck";
    }

    public Giant(String inName){
	this();
	_name = inName;
    }

    //Returns a brief summary of the chosen Character
    public String about(Character c){
	return "A friendly monster with high strength and HP. However, due to the giant's poor vision and lack of agility, its attacks are often weaker than it's opponents.";
    }

    public String specialize(){
	_mana -= 50;
	_strength += (int)(Math.random() * 400);
	return "The Giant has charged up a heavy blow!";
    }

    //Reverts character's stats to original values
    public void normalize(){
	_defense = originalDefense;
	_strength = originalStrength;
    }
}
    
