//Andrew Qu [Team of Teamz {Yuyang, Michael}]
//APCS1 pd 1
//HW 34 -- Ye Olde Role Playing Game, Unchained
//2016 - 11 - 23

/*=============================================
  class YoRPG -- Driver file for Ye Olde Role Playing Game.
  Simulates monster encounters of a wandering adventurer.
  Required classes: Warrior, Monster
  =============================================*/

import java.io.*;
import java.util.*;

public class YoRPG
{
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    //change this constant to set number of encounters in a game
    public static int MAX_ENCOUNTERS = 5;

    //each round, a Warrior and a Monster will be instantiated...
    private Character pat;   //Is it man or woman?
    private Monster smaug; //Friendly generic monster name?

    private int moveCount;
    private boolean gameOver;
    private int difficulty;

    private InputStreamReader isr;
    private BufferedReader in;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
    public YoRPG()
    {
	moveCount = 0;
	gameOver = false;
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
	newGame();
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

    /*=============================================
      void newGame() -- gathers info to begin a new game
      pre:  
      post: according to user input, modifies instance var for difficulty 
      and instantiates a Warrior
      =============================================*/
    public void newGame()
    {
	String s;
	String name = "";
	s = "~~~ Welcome to Ye Olde RPG! ~~~\n";

	s += "\nChoose your difficulty: \n";
	s += "\t1: Easy\n";
	s += "\t2: Not so easy\n";
	s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
	s += "Selection: ";
	System.out.print( s );

	try {
	    difficulty = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }
	
        s = "\nHow lucky do you feel?\n\n";

	s += "Number of encounters: ";
	System.out.print(s);

	try {
	    MAX_ENCOUNTERS = Integer.parseInt(in.readLine());
	}
	catch ( IOException e ) { }

	Character w1 = new Warrior();
	Character g1 = new Giant();
	Character m1 = new Mage();
	Character b1 = new Bowman();
	Character r1 = new Rogue();
	
	s = "\nPick ur hecking character:\n";
	s += "\t1: Warrior -- " + w1.about(w1) + "\n";
	s += "\t2: Giant -- " + g1.about(g1) + "\n";
	s += "\t3: Mage -- " + m1.about(m1) + "\n";
	s += "\t4: Bowman -- " + b1.about(b1) + "\n";
	s += "\t5: Rogue -- " + r1.about(r1) + "\n";
	s += "Selection:";
	System.out.print(s);
        int choice = 1;
	try {
	    choice = Integer.parseInt( in.readLine() );
	}
	catch (IOException e){ }

	String type;

        if (choice == 1){
	    type = "Warrior";
	}
	if (choice == 2){
	    type = "Giant";
	}
	if (choice == 3){
	    type = "Mage";
	}
	if (choice == 4){
	    type = "Bowman";
	}
	if (choice == 5){
	    type = "Rogue";
	}
	else{
	    type = "Warrior";
	}
	
	s = "Intrepid " + type + " what doth thy call thyself? (State your name): ";
	System.out.print( s );

	try {
	    name = in.readLine();
	}
	catch ( IOException e ) { }
	
	//instantiate the player's character
	if (type.equals("Warrior")){
	    pat = new Warrior(name);
	}
	if (type.equals("Mage")){
	    pat = new Mage(name);
	}
	if (type.equals("Rogue")){
	    pat = new Rogue(name);
	}
	if (type.equals("Bowman")){
	    pat = new Bowman(name);
	}
	if (type.equals("Giant")){
	    pat = new Giant(name);
	}

    }//end newGame()


    /*=============================================
      boolean playTurn -- simulates a round of combat
      pre:  Warrior pat has been initialized
      post: Returns true if player wins (monster dies).
      Returns false if monster wins (player dies).
      =============================================*/
    public boolean playTurn()
    {
	int i = 1;
	int d1, d2;

	if ( Math.random() >= ( difficulty / 3.0 ) )
	    System.out.println( "\nNothing to see here. Move along!" );
	else {
	    System.out.println( "\nLo, yonder monster approacheth!" );

	    smaug = new Monster();

	    while( smaug.isAlive() && pat.isAlive() ) {

		// Give user the option of using a special attack:
		// If you land a hit, you incur greater damage,
		// ...but if you get hit, you take more damage.
		try {
		    System.out.println( "\nUse a special attack?" );
		    System.out.println( "\t1: Nay.\n\t2: Aye!" );
		    i = Integer.parseInt( in.readLine() );
		}
		catch ( IOException e ) { }

		if ( i == 2 )
		    if (pat.getMana() > 50){
			System.out.println(pat.specialize());
		    }
		    else{
			pat.normalize();
			System.out.println("Out of mana!");
		    }
		else
		    pat.normalize();

		d1 = pat.attack( smaug );
		d2 = smaug.attack( pat );

		System.out.println( "\n" + pat.getName() + " " + pat.getVerb() + " for " + d1 +
				    " points of damage. The monster now has " + smaug.getHealth() + " points of hit!");

		System.out.println( "\n" + "Ye Olde Monster smacked " + pat.getName() +
				    " for " + d2 + " points of damage. You now have " + pat.getHealth() + " points of hit!");
	    }//end while

	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && !pat.isAlive() ) {
		System.out.println( "'Twas an epic battle, to be sure... " + 
				    "You cut ye olde monster down, but " +
				    "with its dying breath ye olde monster. " +
				    "laid a fatal blow upon thy skull." );
		return false;
	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
		System.out.println( "HuzzaaH! Ye olde monster hath been slain!" );
		return true;
	    }
	    //option 3: the beast slays you
	    else if ( !pat.isAlive() ) {
		System.out.println( "Ye olde self hath expired. You got dead." );
		return false;
	    }
	}//end else

	return true;
    }//end playTurn()
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    public static void main( String[] args )
    {
	//As usual, move the begin-comment bar down as you progressively 
	//test each new bit of functionality...

	//loading...
	YoRPG game = new YoRPG();

	int encounters = 0;

	while( encounters < MAX_ENCOUNTERS ) {
	    if ( !game.playTurn() )
		break;
	    encounters++;
	    System.out.println();
	}

	System.out.println( "Thy game doth be over." );
    }//end main

}//end class YoRPG


