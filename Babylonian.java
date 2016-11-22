// Team NMS
// Niko Cruz-Marsted, Marcus Ng, Shaikat Islam
// APCS1 pd4
// HW #34: Ye Olde Role Playing Game, Unchained
// 2016-11-22

public class Babylonian extends Character {
    
    // Overloaded constructor from superclass
    public Babylonian(String newName) {
	super(50, 1619, 30, 0.5);
	//1619 is the number of characters in Bob Marley's "Babylon System";
	name = newName;
    }

    // Special Attack
    public void specialize() {
	defense -= 15;
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
	info = "Thee beest the Babylonian, the destroyeth'r of all things sacred, the most indiff'rent, with z'ro spiritual ability\n";
	info += "Health: 50\n" + "Strength:1619 \n"+ "Defense:30\n"+ "Attack Rating: 0.5\n" + "Spritual Ability:0\n";
	return info;
    }
    
}
