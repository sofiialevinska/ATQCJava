package HW;

public class Chicken extends NonflyingBird {

    public Chicken (String feather, boolean layEggs) {
        this.feather = feather;
        this.layEggs = layEggs;
    }
    public String fly () {
        return ("^^^^^^^^^^^^^^CHICKEN DOESN'T FLY and has " +feather+ " feather and layEggs: " + layEggs + "\n" + fly);
    }

}
