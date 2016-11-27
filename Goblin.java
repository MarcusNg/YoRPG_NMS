// Team NMS
// Niko Cruz-Marsted, Marcus Ng, Shaikat Islam
// APCS1 pd4
// HW #35: Ye Olde Role Playing Game, Realized
// 2016-11-27

public class Goblin extends Character {
    
    // Overloaded constructor from superclass
    public Goblin() {
	super(100 + (int)(Math.random() * 30), 50, 20 + (int)(Math.random() * 30), 0.6);
    }

    public String getName() {
	return "Goblin";
    }
    
       // Special Attack
    public void specialize() {
	defense -= 20;
	attackRating += 1.0;
    }

    // Reset defense and attackRating
    public void normalize() {
	defense = getDefense();
	attackRating = 1.0;
    }

    // Description
    public String about() {
	String info;
	info = "The goblin.";
	return info;
    }
    

}
