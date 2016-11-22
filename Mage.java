// Team NMS
// Niko Cruz-Marsted, Marcus Ng, Shaikat Islam
// APCS1 pd4
// HW #34: Ye Olde Role Playing Game, Unchained
// 2016-11-22

public class Mage extends Character {
    
    // Overloaded constructor from superclass
    public Mage(String newName) {
	super(100, 100, 30, 0.5);
	name = newName;
    }

    // Special Attack
    public void specialize() {
	defense -= 10;
	attackRating += 0.4;
    }

    // Reset defense and attackRating
    public void normalize() {
	defense = 30;
	attackRating = 0.5;
    }

    // Description
    public String about() {
	String info;
	info = "The mage, who is't practices the dunnest of arts\n";
	info += "Health: 100\n" + "Strength:100 \n"+ "Defense:30\n"+ "Attack Rating: 0.5\n" + "Magical Ability:12000000000000\n";
	return info;
    }
    
}
