# YoRPG_ofTeamz

Hear ye hear ye! The Team of Teamz proudly presents:
Ye Olde Role-playing Game!

How-to-Play

With java YoRPG, the 'game' will begin to run. Like most games, a difficulty was first be selected.
We also permit the player to select the amount of encounters they would like.
	If you're looking for a quick short game, put in 3 (rounds).
	If you have time, put in 300 (rounds).
After doing so, you will be asked to choose a character to play as.
	There will be a number of characters, ranging from Warrior to Bowman.
In addition, you may provide a name to your character.
As the game starts, you will encounter monsters and ocassionally demons.
	With a specialized attack and a normalized attack, your goal is to defeat these demons.
	If you survive all the rounds, you win!

How it works

When run, the game will first prompt you to enter values for difficulty, which will determine how likely a monster will spawn, and for how many encounters you desire. A user input of anything other than an integer will result in an error. An instance of class Character is initialized. Character is a superclass of 5 subclasses the player can choose from, as well as the 2 types of monsters. The player's choice of subclass is recorded through a list of else if statements that cycle through each possible subclass. The earlier instance of Character is now assigned a new instance of the chosen subclass, and the game is underway!

The number of encounters that the player inputs is essentially the maximum number of times playTurn() will run. With each run, there is a chance that the player sees no monster at all. However, if a monster does spawn, there are two possibilites. Through the usage of Math.random(), either regular monsters or demons will spawn. Due to the higher percentage of monster spawns, the demons will have higher stats set in its class file. The player and monster fight until someone dies. Whoever dies (it could be both) will determine the message outputted to the terminal. If the player is still alive and the maximum number of encounters has not been reached, playTurn() runs again.

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
	
	

