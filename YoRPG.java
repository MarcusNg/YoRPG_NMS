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
    public final static int MAX_ENCOUNTERS = 5;
    
    //each round, a Warrior and a Monster will be instantiated...
    private static Character pat;   //Is it man or woman?
    private Character smaug; //Friendly generic monster name?

    private static int moveCount;
    private boolean gameOver;
    private int difficulty;
    private int charselect;

    private static InputStreamReader isr;
    private static BufferedReader in;
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

	s += "\nChoose your difficulty\n";
	s += "\t1: Easy\n";
	s += "\t2: Not so easy\n";
	s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
	s += "Selection: ";
	System.out.print( s );



	try {
	    difficulty = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }


	s = "Intrepid warrior, what doth thy call thyself? (State your name): ";
	System.out.print( s );

	try {
	    name = in.readLine();
	}
	catch ( IOException e ) { }
	//character selection uses user input to choose character and Character.about() method to display stats
        String c;
	c = "\nChoose your character: \n";
	c += "\t1: Warrior\n";
	c += "\t2: Babylonian\n";
	c += "\t3: Necromancer\n";
	c += "\t4: Rogue\n";
	c += "\t5: Mage\n";
	c += "Selection: ";
	System.out.print( c );
	
	try {
	    charselect = Integer.parseInt( in.readLine() );
	    if (charselect == 1){
		pat = new Warrior( name );
	    } else if (charselect == 2){
		pat = new Babylonian( name );
	    } else if (charselect == 3){
		pat = new Necromancer( name );
	    } else if (charselect == 4){
		pat = new Rogue( name );
	    } else {
		pat = new Mage( name );
	    }

	    System.out.println(pat.about());
	}
	catch ( IOException e ) { }


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

	    // Random monster
	    int enemyNum = 0;
	    enemyNum = (int)(Math.random() * 3);
	    if (enemyNum == 0) {
		smaug = new Skeleton();
	    } else if (enemyNum == 1) {
		smaug = new Goblin();
	    } else {
		smaug = new Troll();
	    }

	    // Current HP of each character (runs once before attack)
	    System.out.println("\n" + pat.getName() + " has " + pat.getHP() + " HP.");
		System.out.println("\n" + smaug.getName() + " has " + smaug.getHP() + " HP." + "\n");
		
	    while( smaug.isAlive() && pat.isAlive() ) {

		// Give user the option of using a special attack:
		// If you land a hit, you incur greater damage,
		// ...but if you get hit, you take more damage.
		try {
		    System.out.println( "\nDo you feel lucky?" );
		    System.out.println( "\t1: Nay.\n\t2: Aye!" );
		    moveCount += 1;
		    i = Integer.parseInt( in.readLine() );
		}
		catch ( IOException e ) { }
		
		if ( i == 2 )
		    pat.specialize();
		else
		    pat.normalize();

		d1 = pat.attack( smaug );
		d2 = smaug.attack( pat );
		
		System.out.println( "\n" + pat.getName() + " dealt " + d1 +
				    " points of damage.");

		System.out.println( "\n" + "Ye Olde Monster smacked " + pat.getName() +
				    " for " + d2 + " points of damage.");

		// Print HP After Attack
		System.out.println("\n" + pat.getName() + " has " + pat.getHP() + " HP.");
		System.out.println("\n" + smaug.getName() + " has " + smaug.getHP() + " HP.");
		
	    }//end while

	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && !pat.isAlive() ) {
		System.out.println( "'Twas an epic battle, to be sure... " + 
				    "You cut ye olde monster down, but " +
				    "with its dying breath ye olde monster. " +
				    "laid a fatal blow upon thy skull.\n");
		return false;
	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
		System.out.println( "HuzzaaH! Ye olde monster hath been slain!\n");
		return true;
	    }
	    //option 3: the beast slays you
	    else if ( !pat.isAlive() ) {
		System.out.println( "Ye olde self hath expired. You got dead.\n" );
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
	
	String mC = moveCount + "";
	//the game is over
	System.out.println( "Thy game doth be over." );
	
	System.out.println("\n");
	
	if (moveCount > 7 && moveCount < 10 ){
	    String s = "";
	    s = "Thee madeth " + mC + " moves.";
	    s += "\n";
	    s += "Practical peasant.";
	    System.out.println(s);
	}
	else if (moveCount >10  && moveCount < 14 ){
	    String s = "";
	    s = "Thee madeth " + mC + " moves.";
	    s += "\n";
	    s += "Slightly less practical peasant.";
	    System.out.println(s);
	}
	else if (moveCount >14 && moveCount < 21 ){
	    String s = "";
	    s = "Thee madeth " + mC + " moves.";
	    s += "\n";
	    s += "Slightly, slightly, less practical peasant.";
	    System.out.println(s);
	}
	else {
	    String s = "";
	    s = "Thee madeth " + mC + " moves.";
	    s += "\n";
	    s += "Take a break, peasant.";
	    System.out.println(s);
	}
	    String stats = "\nDoth thou want thy stats?\n";
	    stats += "\t1: Yes.\n";
	    stats += "\t2: No.\n";
	    System.out.println(stats);
	
        try {
	    int i;
	    i = Integer.parseInt(in.readLine());
	    if (i == 1){
		String x = "";
		x += "\nName: " + pat.getName();
		x += "\nHP: " + pat.getHP();
		x += "\nDefense: " + pat.getstrength();
		x += "\nAttack Rating: " + pat.getattackRating();
		x += "\nMoves: " + mC;
		System.out.println(x);
	    }
	    else{
		
	        String x = "\nToo bad.";
		x += "\nName: " + pat.getName();
		x += "\nHP: " + pat.getHP();
		x += "\nDefense: " + pat.getstrength();
		x += "\nAttack Rating: " + pat.getattackRating();
		x += "\nMoves: " + mC;
		System.out.println(x);
	    }
		}
       	catch ( IOException e ) { }

	
       

	
	
	/*================================================
	  ================================================*/
    }//end main

}//end class YoRPG


