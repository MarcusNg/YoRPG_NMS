// Team NMS
// Niko Cruz-Marsted, Marcus Ng, Shaikat Islam
// APCS1 pd4
// HW #34: Ye Olde Role Playing Game, Unchained
// 2016-11-22

public abstract class Character {

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

    // Special attack
    public abstract void specialize();
    
    // Reset defense and attackRating
    public abstract void normalize();

    // Describe Class
    public abstract String about();
    
}
