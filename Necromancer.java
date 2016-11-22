// Team NMS
// Niko Cruz-Marsted, Marcus Ng, Shaikat Islam
// APCS1 pd4
// HW #34: Ye Olde Role Playing Game, Unchained
// 2016-11-22

public class Necromancer extends Character {
    
    // Overloaded constructor from superclass
    public Necromancer(String newName) {
	super(100, 90, 30, 0.6);
	name = newName;
    }

    // Special Attack
    public void specialize() {
	defense -= 10;
	attackRating += 0.2;
    }

    // Reset defense and attackRating
    public void normalize() {
	defense = 30;
	attackRating = 0.6;
    }

    // Description
    public String about() {
	String info;
	info = "The necromanc'r, the one yond endues people backeth from the dead\n";
	info += "Health: 100\n" + "Strength:100 \n"+ "Defense:30\n"+ "Attack Rating: 0.5\n" + "Death Magick:12000000000000\n";
	return info;
    }
}
