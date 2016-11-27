// Team NMS
// Niko Cruz-Marsted, Marcus Ng, Shaikat Islam
// APCS1 pd4
// HW #35: Ye Olde Role Playing Game, Realized
// 2016-11-27

public class Troll extends Character {

    // Overloaded constructor from superclass
    public Troll() {
	super(150, 30 + (int)(Math.random() * 45), 20 + (int)(Math.random() * 35), 0.7);
    }

    // Get name
    public String getName() {
	return "Troll";
    }

    // Special Attack
    public void specialize() {
	defense -= 15;
	attackRating += 0.3;
    }

    // Reset defense and attackRating
    public void normalize() {
	defense = getDefense();
	attackRating = 0.4;
    }

    // Description
    public String about() {
	String info;
	info = "The Troll";
	return info;
    }
    
}
		
	
