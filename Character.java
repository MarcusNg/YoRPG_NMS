// Team NMS
// Niko Cruz-Marsted, Marcus Ng, Shaikat Islam
// APCS1 pd4
// HW #32: Ye Olde Role Playing Game, Improved
// 2016-11-18

public class Character {

    protected String name;
    protected int HP;
    protected int strength;
    protected int defense;
    protected double attackRating;

    // Overloaded constructor
    public Character(int newHP, int newStrength, int newDefense, double newAttackRating) {
	HP = newHP;
	strength = newStrength;
	defense = newDefense;
	attackRating = newAttackRating;
    }
    
    // Check if player is alive
    public boolean isAlive() {
	return HP > 0;
    }

    // Get name
    public String getName() {
        return name;
    }

    // Get HP
    public int getHP() {
	if (HP < 0) {
	    HP = 0;
	}
	return HP;
    }
    
    // Get defense
    public int getDefense() {
        return defense;
    }
  
    //depreciates hit points
    public int lowerHP(int decreaseHP){
	HP -= decreaseHP;
        return HP;
    }

    // Attack character
    public int attack(Character character){
        int damage;
	damage = (int)((strength * attackRating) - character.getDefense());
	if (damage < 0) {
	    damage = 0;
	}
	character.lowerHP(damage);
        return damage;
    }

    //special attack
    public void specialize(){
	defense -= 15;
	attackRating += 0.3;
    }
    
    //reset defense and attackrating
    public void normalize() {
	defense = 40;
	attackRating = 0.4;
    }

    // Describe class
    public static String about() {
	String a;
	// Describe Warrior, Monster, Mage, Rogue, Babylonian, and Necromancer in one string
	a = "\nBeholdeth, playeth'r! the choice of charact'r is up to thee! shalt thee beest the ruthless warri'r, straight out of the confines of the deep, with stats as follows:\n";
	a+= "\nHealth: 125\n" + "Strength: 100\n"+ "Defense:40\n"+ "Attack Rating: 0.4\n";

	a+= "\nOR shall thee beest the Babylonian, the destroyeth'r of all things sacred, the most indiff'rent, with z'ro spiritual ability,  sir?\n";

	a+= "Health: 50\n" + "Strength:1619 \n"+ "Defense:30\n"+ "Attack Rating: 0.5\n" + "Spritual Ability:0\n";

	a+="\nOR the mage, who is't practices the dunnest of arts\n";

	a+= "Health: 100\n" + "Strength:100 \n"+ "Defense:30\n"+ "Attack Rating: 0.5\n" + "Magical Ability:12000000000000\n";

	a+="\nOR the necromanc'r, the one yond endues people backeth from the dead\n";

	a+= "Health: 100\n" + "Strength:100 \n"+ "Defense:30\n"+ "Attack Rating: 0.5\n" + "Death Magick:12000000000000\n";

	a+="\nOR the rogue, the one yond endues pow'r from stealth and thiev'ry\n";

	a+= "Health: 100\n" + "Strength:120\n"+ "Defense:35\n"+ "Attack Rating: 0.5\n" + "Thievery:12000000\n";
	a+= "\nChooseth wisely because thy choice hast the most pow'r!";


	return a;



	

	
    }
    
}
