// Team NMS
// Niko Cruz-Marsted, Marcus Ng, Shaikat Islam
// APCS1 pd4
// HW #35: Ye Olde Role Playing Game, Realized
// 2016-11-23

public class Troll extends Character {
    
    private int defenseNum;
    defenseNum = 20 + (int)(Math.random() * 30);

    // Overloaded constructor from superclass
    public Troll() {
	super(150, 30 + (int)(Math.random() * 45), defenseNum, 0.7);
	name = newName;
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
	defense = defenseNum;
	attackRating = 0.4;
    }

    // Description
    public String about() {
	String info;
	info = "The Troll";
	return info;
    }
    
}
		
	
