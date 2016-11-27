# YoRPG_ofTeamz

Hear ye hear ye! The Team of Teamz proudly presents:
Ye Olde Role-playing Game!

How-to-Play

With java YoRPG, the 'game' will begin to run. Like most games, a difficulty was first be selected.
We also permit the player to select the amount of encounters they would like.
	- If you're looking for a quick short game, put in 3 (rounds).
	- If you have time, put in 300 (rounds).
After doing so, you will be asked to choose a character to play as.
	- There will be a number of characters, ranging from Warrior to Bowman.
In addition, you may provide a name to your character.
As the game starts, you will encounter monsters and ocassionally demons.
	-With a specialized attack and a normalized attack, your goal is to defeat these demons.
	-If you survive all the rounds, you win!

How it works

Commit history:

Andrew's escapades (which he unfortunately misstyped):
	 The specialize method, originally identical for every subclass of Character, has been customized to better fit the theme of each one. Previously, specialize would buff and lower the _strength and _defense, respectively, of the character by random values. Thus, specialize was not always beneficial. The new versions of specialize will always aid you in your battle.
	 
	 Bowman - Doubles _strength for a critical strike, while lowering _defense slightly
	 Giant - Increases _strength by a random value from 0 to 400
	 Mage - Heals oneself by a random value from 0 to 30
	 Rogue - Increases _defense by an absurd amount such that an enemy attack will deal only 1 point of damage. Combined with a 1 health point heal, this simulates dodging an attack
	 Warrior - Increases _strength by a value from 10 to 20, and decreases _defense by a value up to 10

Since choosing to specialize is now always a better choice, the variable mana was added to Character, which was passed down to all of its subclasses. Every use of specialize costs 50 mana.
Specialize is no longer void, and instead returns a String describing its effect

Yuyang's Demon:
	With the addition to the possible monster encounters, we now included the possibilites of demons. Through the use of Math.random()*10, these demons have a 20% chance of spawning. Monsters have the other 80% percent. Due to the demon's rareness, they will have higher stats than the monsters. 
	The addition of demon was implemented with a similar format to monster.
	
	

