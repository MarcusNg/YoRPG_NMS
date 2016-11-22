// Team NMS
// Niko Cruz-Marsted, Marcus Ng, Shaikat Islam
// APCS1 pd4
// HW #32: Ye Olde Role Playing Game, Improved
// 2016-11-18

public class Monster extends Character {

    // Overloaded constructor of super class Character
    public Monster() {
	super(150, 20 + (int)(Math.random() * 45), 20, 1);
    }
    
    // Get name
    public String getName() {
        return "Monster";
    }
    
}
