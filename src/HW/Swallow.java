package HW;

public class Swallow extends FlyingBird {

    public Swallow (String feather, boolean layEggs) {
        this.feather = feather;
        this.layEggs = layEggs;
    }
    public String fly () {
        return ("--------------SWALOW FLIES and has " +feather+ " feather and layEggs: " + layEggs+ "\n" + fly);
    }

}
