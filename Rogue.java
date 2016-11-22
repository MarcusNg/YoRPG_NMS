// Team NMS
// Niko Cruz-Marsted, Marcus Ng, Shaikat Islam
// APCS1 pd4
// HW #34: Ye Olde Role Playing Game, Unchained
// 2016-11-22

public class Rogue extends Character {
    
    // Overloaded constructor from superclass
    public Rogue(String newName) {
	super(110, 120, 35, 0.4);
	name = newName;
    }

    // Special Attack
    public void specialize() {
	defense -= 20;
	attackRating += 0.3;
    }

    // Reset defense and attackRating
    public void normalize() {
	defense = 35;
	attackRating = 0.4;
    }

    // Description
    public String about() {
	String info;
	info = "The rogue, the one yond endues pow'r from stealth and thiev'ry\n";
	info += "Health: 100\n" + "Strength:120\n"+ "Defense:35\n"+ "Attack Rating: 0.5\n" + "Thievery:12000000\n";
	return info;
    }
    
    
}
