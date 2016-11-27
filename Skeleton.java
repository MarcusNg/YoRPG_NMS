// Team NMS
// Niko Cruz-Marsted, Marcus Ng, Shaikat Islam
// APCS1 pd4
// HW #35: Ye Olde Role Playing Game, Realized
// 2016-11-27

public class Skeleton extends Character{
    
    public Skeleton() {
	super(150, 20 + (int)(Math.random() * 45), 15 + (int)(Math.random() * 30), 1);
    }
    
    // Get name
    public String getName() {
        return "Skeleton";
    }
    // Special Attack
    public void specialize() {
	defense -= 10;
	attackRating += 0.3;
    }

    // Reset defense and attackRating
    public void normalize() {
	defense = getDefense();
	attackRating = 1;
    }

    // Description
    public String about() {
	String info;
	info = "You are about to face the skeleton";
	return info;

    }
}
