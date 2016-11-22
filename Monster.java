// Team NMS
// Niko Cruz-Marsted, Marcus Ng, Shaikat Islam
// APCS1 pd4
// HW #34: Ye Olde Role Playing Game, Unchained
// 2016-11-22

public class Monster extends Character {

    // Overloaded constructor of super class Character
    public Monster() {
	super(150, 20 + (int)(Math.random() * 45), 20, 1);
    }
    
    // Get name
    public String getName() {
        return "Monster";
    }

    // Special Attack
    public void specialize() {
	defense -= 10;
	attackRating += 0.3;
    }

    // Reset defense and attackRating
    public void normalize() {
	defense = 20;
	attackRating = 1;
    }

    // Description
    public String about() {
	String info;
	info = "Generic Monster";
	return info;
    }
}
