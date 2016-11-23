//Andrew Qu [Team of Teamz {Yuyang, Michael}]
//APCS1 pd 1
//HW 34 -- Ye Olde Role Playing Game, Unchained
//2016 - 11 - 23

public class Monster extends Character{   

    //overloaded constructor
    public Monster(){
	_hitPts = 150;
	_defense = 20;
	_att_rating = 1;
	//gives random strength
	_strength = (20 + (int)(Math.random() * 45));
    }

    //Returns a brief summary of the chosen Character
    public String about(Character c){
	return "A common being that strikes its foes with devastating melee attacks!";
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
