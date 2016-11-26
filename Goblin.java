// Team NMS
// Niko Cruz-Marsted, Marcus Ng, Shaikat Islam
// APCS1 pd4
// HW #34: Ye Olde Role Playing Game, Unchained
// 2016-11-22

public class Goblin extends Character {
    private int defenseNum = (int)(Math.random() * 40);

    // Overloaded constructor from superclass
    public Goblin(int defenseNum) {
	super((int)(Math.random() * 200), 200,defenseNum, 1.0);

    }
       // Special Attack
    public void specialize() {
	defense -= 20;
	attackRating += 1.0;
    }

    // Reset defense and attackRating
    public void normalize() {
	defense = defenseNum;
	attackRating = 1.0;
    }

    // Description
    public String about() {
	String info;
	info = "The goblin.";
	return info;
    }
    

}
