// Team NMS
// Niko Cruz-Marsted, Marcus Ng, Shaikat Islam
// APCS1 pd4
// HW #34: Ye Olde Role Playing Game, Unchained
// 2016-11-22

public class Warrior extends Character {
    
    // Overloaded constructor from superclass
    public Warrior(String newName) {
	super(125, 100, 40, 0.4);
	name = newName;
    }

    // Special Attack
    public void specialize() {
	defense -= 15;
	attackRating += 0.3;
    }

    // Reset defense and attackRating
    public void normalize() {
	defense = 40;
	attackRating = 0.4;
    }

    // Description
    public String about() {
	String info;
	info = "Thee beest the ruthless warri'r, straight out of the confines of the deep, with stats as follows:\n";
	info += "\nHealth: 125\n" + "Strength: 100\n"+ "Defense:40\n"+ "Attack Rating: 0.4\n";
	return info;
    }
    
}
		
	
